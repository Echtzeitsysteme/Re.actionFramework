package org.reaction.gklTest.utils;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GKLModel.GKLModelFactory;
import GKLModel.K;
import GKLModel.P;
import GKLModel.P_s;
import GKLModel.T;
import GKLModel.U_s;
import reactionContainer.Agent;
import reactionContainer.Container;
import reactionContainer.ReactionContainerFactory;

public class ModelGenerator {

	public static Resource createAndSaveModel(String outputPath, int option) {

		URI uri = URI.createFileURI(outputPath);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource resource = rs.createResource(uri);
		Container container = createContainer(option);
		resource.getContents().add(container);

		try {
			GeneratorUtils.saveModelContainer(resource, outputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Model could not be stored at the given location.");
		}

		return resource;
	}

	public static Resource loadModel(String path) {
		try {
			return GeneratorUtils.loadResource(path);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Model could not be loaded from the given location.");
			return null;
		}
	}

	private static Container createContainer(int instanceOption) {
		GKLModelFactory entityfactory = GKLModelFactory.eINSTANCE;
		ReactionContainerFactory containerFactory = ReactionContainerFactory.eINSTANCE;
		Container container = containerFactory.createContainer();
		U_s us = entityfactory.createU_s();
		P_s ps = entityfactory.createP_s();
		container.getStates().add(us);
		container.getStates().add(ps);

		List<Agent> agents = new LinkedList<>();
		// Create free agents
		boolean tUnphosDone = false;
		for (int i = 0; i < 30; i++) {
			agents.add(entityfactory.createK());
			agents.add(entityfactory.createP());
			T t = entityfactory.createT();
			if (!tUnphosDone) {
				t.setT_x_u(us);
				t.setT_y_u(us);
			} else {
				t.setT_x_p(ps);
				t.setT_y_p(ps);
			}
			if (i == 14) {
				tUnphosDone = true;
			}
			agents.add(t);
		}

		// create bound configurations
		for (int i = 0; i < 10; i++) {
			K ku = entityfactory.createK();
			T tku = entityfactory.createT();
			tku.setT_x_u(us);
			ku.setK_a(tku);
			tku.setT_x(ku);
			agents.add(ku);
			agents.add(tku);
			
			K kp = entityfactory.createK();
			T tkp = entityfactory.createT();
			tkp.setT_x_p(ps);
			kp.setK_a(tkp);
			tkp.setT_x(kp);
			agents.add(kp);
			agents.add(tkp);
			
			P pu = entityfactory.createP();
			T tpu = entityfactory.createT();
			tpu.setT_x_u(us);
			pu.setP_a(tpu);
			tpu.setT_x(pu);
			agents.add(pu);
			agents.add(tpu);
			
			P pp = entityfactory.createP();
			T tpp = entityfactory.createT();
			tpp.setT_x_p(ps);
			pp.setP_a(tpp);
			tpp.setT_x(pp);
			agents.add(pp);
			agents.add(tpp);
		}

		container.getAgents().addAll(agents);
		return container;
	}

}
