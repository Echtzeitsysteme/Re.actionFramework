# Re.actionFramework
This repository provides the *Re.action* language including the necessary framework for integrating and using it with the Tool [SimSG](https://github.com/Echtzeitsysteme/SimSG).

## Requirements
* Java SE 8 or higher
* Working [eMoflon](https://github.com/eMoflon/emoflon-ibex) setup (visit link for instructions on how to do that) containing:
  * GraphViz
  * Eclipse Modeling Tools
  * Xtext
  * PlantUML
  * eMoflon::IBeX itself
* SimSG as provided and instructed [here](https://github.com/Echtzeitsysteme/SimSG)
If you don't already have a working setup of eMoflon it is recommended to start with a fresh and clean install of eclipse as provided by the Eclipse Modeling Tools.
 
## How to Install
First install eMoflon and SimSG according to the [Requirements-Section](https://github.com/Echtzeitsysteme/Re.actionFramework#requirements). Ignore all errors until you have completed each and every step. If after finishing all steps errors still persist, consult the [Troubleshooting-Section](https://github.com/Echtzeitsysteme/Re.actionFramework#troubleshooting).
As soon as you have a working eMoflon setup and pulled the repository you have to follow a few last instruction to be able to work with the *Re.action-Framework*:
1. Start a dynamic eMoflon workspace with SimSG
2. Pull the *Re.action* framework into that workspace
3. Create the necessary language artifacts. To do so, find the `ReactionLanguage.xtext` in `org.reaction.dsl`, right-click it and choose `"Run as.." -> "Generate Xtext Artifacts"`.
4. Create all necessary models by running the corresponding `.genmodel`-workflows. You can find all three of them by pressing `Ctrl + Shift + R` and then searching for `.genmodel`. Open all of them in the editor. There, right-click the top-level item and choose `Generate Model Code`. Do so for all three of them.
5. Done! You're ready to go!

## How to Use
To create your own models in *Re.action*, open a dynamic workspace by right-clicking any of the org.reaction.* projects and running it as Eclipse Application.
Any files with the `.react`-extension in there should be recognized by Xtext. Please be aware that maybe not all invalid components throw an error or warning message yet. If you encounter any of these, feel free to communicate that via the 'Issues'-section.

### Working example
This repository contains a working example model of the so-called *Goldbeter-Koshland-Loop (GKL)*. You can find it in the `example`-folder. Once you opened the `GKL.react`-file within the dynamic Re.action-Workspace, a .xmi-file representing the specified model should be created and modified every time any changes are saved. The transformation and integration of the specified model into a corresponding simulation model for *SimSG* has yet to be done manually as given by the following instructions:
1. Go into `org.reaction.main`
2. Run the `Main`-file  as Java Application to start the transformation. Any needed files for the simulation to run will be placed in the `org.reaction.gklExample`-SimSG-project
3. Build the SimSG-Project `org.reaction.gklExample` by right-clicking it and choosing `SimSG -> Build selected projects fully`
4. If you still get compilation errors, try building the project as normal Java project now
5. Now you are able to run e.g. `GKLBenchmark` in `org.reaction.gklExample.benchmark`. You can choose between the Pattern Matching Engines *HiPE* and *Democles* by (un-)commenting the corresponding lines in the `GKLBenchmark`-file

### Running own models
If you want to run any model of your own, you basically follow the same instructions as given with the example above. Except you have to adjust the origin- and target-location in the `Main`-file in `org.reaction.main` before starting the transformation.
* `srcModelLocation` has to point to the `.xmi`-file that was created automatically after saving your `.react`-model
* `trgProjectLocation` has to point to the *SimSG*-Project folder you want to run the simulation with
If you run any simulations as given by the working example above, make sure that the model of the `SimulationConfigurator` is set to the name of your `.xmi`-file (excluding the file-extension).

## Troubleshooting ##
* If your .xtend-files seem somehow corrupted or strangely formatted, make sure to set the editor's textfile encoding to 'Other: UTF-8' in `Window->Preferences->General->Workspace`
* In any case it could be sufficient to try checking for updates even though all requirements were just freshly installed
* Try building everything by use of the update sites contained in your workspace after pulling all necessary repositories. In Order to do so, choose the corresponding update site, open its `site.xml` and choose 'Build All'
