package test.benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import GKL_created_test.api.GKL_created_testAPI;
import GKL_created_test.api.GKL_created_testApp;
import GKL_created_test.api.GKL_created_testDemoclesApp;
import GKL_created_test.api.GKL_created_testHiPEApp;
import GKL_created_test.api.GKL_created_testSimSGApi;

public class Benchmark {
	
	public static void main(String[] args) {

		GKL_created_testSimSGApi api = new GKL_created_testSimSGApi();
		api.configureForDemocles();
//		api.configureForHiPE();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
		config.setModel("GKLModelDefinition");
		config.addSimpleTerminationCondition(10000, -1);
		config.addObservableStatistic();
		 
		Simulation sim = config.createSimulation();
		sim.initializeClocked();
		sim.runClocked();
		sim.printCurrentMatches(); 
		sim.displayResults();
		sim.saveModelGraph();
		sim.finish();
		
		System.out.println(Runtimer.getInstance().toString());

		
		//rawApplications();
	}
}
