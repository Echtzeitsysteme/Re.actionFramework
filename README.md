# Re.actionFramework
This repository provides the *Re.action* language including the necessary framework for integrating and using it with the Tool [SimSG](https://github.com/Echtzeitsysteme/SimSG).

## Requirements
* Java SE 8 or higher
* Working [eMoflon](https://github.com/eMoflon/emoflon-ibex) setup (visit link for instructions on how to do that) containing:
  * GraphViz
  * Eclipse Modeling Tools (do NOT get the latest version but make sure to use [version 2019-09R](https://www.eclipse.org/downloads/packages/release/2019-09/r/eclipse-modeling-tools) instead)
  * Xtext
  * PlantUML
  * eMoflon::IBeX itself
* SimSG as provided and instructed [here](https://github.com/Echtzeitsysteme/SimSG) in the same workspace as eMoflon.

If you don't already have a working setup of eMoflon it is recommended to start with a fresh and clean install of eclipse as provided by the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2019-09/r/eclipse-modeling-tools).
 
## How to Install
First install eMoflon and SimSG according to the [Requirements-Section](https://github.com/Echtzeitsysteme/Re.actionFramework#requirements). Ignore all errors until you have completed each and every of the following steps. If after finishing every step errors still persist, consult the [Troubleshooting-Section](https://github.com/Echtzeitsysteme/Re.actionFramework#troubleshooting).
As soon as you have a working eMoflon and SimSG setup follow these last instruction to be ablte to work with the *Re.action-Framework*:
1. Checkout this repository (https://github.com/Echtzeitsysteme/Re.actionFramework) into the workspace containing eMoflon and SimSG. It is recommended to use the .psf-file for that
2. Create the necessary language artifacts. To do so, find the `ReactionLanguage.xtext` in `org.reaction.dsl`, right-click it and choose `"Run as.." -> "Generate Xtext Artifacts"`.
3. Create all necessary models by running the corresponding `.genmodel`-workflows. These include:
    * `org.reaction.intermediatemodel -> model -> IntermediateModel.genmodel`
    * `org.reaction.reactionmodel -> model -> ReactionModel.genmodel`
    * Open both of them in the editor, right-click the top-level item and choose `Generate Model Code`
5. Done! You're ready to go!

## How to Use
To create your own models in *Re.action* and run their corresponding simulation in SimSG, follow these steps:
* Open a dynamic workspace by right-clicking any project in your workspace and running it as Eclipse Application. <br>
* In this dynamic workspace, create a new SimSG project via `File -> New -> Project... -> SimSG -> New SimSG Project Wizard`
* Create a new `.react`-file in the src-folder and specify your model in there
* While in the SimSG perspective, select your project and click on the "Build selected projects fully" button or right-click your project and choose `SimSG -> Build selected projects fully` (works in any perspective)
 * You may have to build the project normally again for all errors to disappear (`Project -> Build Project`)
* You can now create any source files in the src-folder to work with your model and the corresponding simulation! If you want to know how to run a simulation, have a look at the [running example](https://github.com/Echtzeitsysteme/Re.actionFramework#running-example]
Any files with the `.react`-extension should be recognized as such by Xtext. Please be aware that maybe not all invalid language components or expressions throw an error or warning message yet. If you encounter any of these, feel free to communicate them via the 'Issues'-section.

### Running example
This repository contains a working example model of the so-called *Goldbeter-Koshland-Loop (GKL)*. You can find it in the `example`-folder. Once you opened the `GKL.react`-file within the dynamic Re.action-Workspace, a .xmi-file representing the specified model should be created and modified every time any changes are saved. The transformation and integration of the specified model into a corresponding simulation model for *SimSG* has yet to be done manually as given by the following instructions:
1. Go into `org.reaction.main`
2. Run the `Main`-file  as Java Application to start the transformation. Any needed files for the simulation to run will be placed in the `org.reaction.gklExample`-SimSG-project
3. Build the SimSG-Project `org.reaction.gklExample` by right-clicking it and choosing `SimSG -> Build selected projects fully`
4. If you still get compilation errors, try building the project as normal Java project now
5. Now you are able to run e.g. `GKLBenchmark` in `org.reaction.gklExample.benchmark`. You can choose between the Pattern Matching Engines *HiPE* and *Democles* by (un-)commenting the corresponding lines in the `GKLBenchmark`-file

### Running your own models
If you want to run any model of your own, you basically follow the same instructions as given with the example above. Except you have to adjust the origin- and target-location in the `Main`-file in `org.reaction.main` before starting the transformation.
* `srcModelLocation` has to point to the `.xmi`-file that was created automatically after saving your `.react`-model
* `trgProjectLocation` has to point to the *SimSG*-Project folder you want to run the simulation with
If you run any simulations as given by the working example above, make sure that the model of the `SimulationConfigurator` is set to the name of your `.xmi`-file (excluding the file-extension).

## Troubleshooting ##
* If your .xtend-files seem somehow corrupted or strangely formatted, make sure to set the editor's textfile encoding to 'Other: UTF-8' in `Window->Preferences->General->Workspace`
* In any case it could be sufficient to try checking for updates even though all requirements were just freshly installed
* Try building everything by use of the update sites contained in your workspace after pulling all necessary repositories. In Order to do so, choose the corresponding update site, open its `site.xml` and choose 'Build All'
* If the build of any SimSG-projects fails, delete the project from your workspace, close the workspace and then reopen it. Open the project again and now try building once more. If this does not work immediately, try it several times. Usually it should work after doing it once
