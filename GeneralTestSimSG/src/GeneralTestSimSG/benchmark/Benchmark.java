package GeneralTestSimSG.benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import GeneralTestSimSG.api.GeneralTestSimSGSimSGApi;
import reactionContainer.ReactionContainerPackage;


public class Benchmark {
	
	public static void main(String[] args) {

		ReactionContainerPackage.eINSTANCE.eClass();
		GeneralTestSimSGSimSGApi api = new GeneralTestSimSGSimSGApi();
//		api.configureForHiPE();
		api.configureForDemocles();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
		config.setModel("GKLModel");
		config.addSimpleTerminationCondition(30000, -1);
		config.addObservableStatistic();
		 
		Simulation sim = config.createSimulation();
		sim.initializeClocked();
		sim.runClocked();
		sim.printCurrentMatches(); 
		sim.displayResults();
		sim.saveModelGraph();
		sim.finish();
		
		System.out.println(Runtimer.getInstance().toString());
	}
	
}
