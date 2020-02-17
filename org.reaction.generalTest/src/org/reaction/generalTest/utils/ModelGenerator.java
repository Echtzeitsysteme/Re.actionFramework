package org.reaction.generalTest.utils;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;
import TestcasesModel.TestcasesModelFactory;
import TestcasesModel.U_s;
import TestcasesModel.X;
import reactionContainer.Agent;
import reactionContainer.Container;
import reactionContainer.ReactionContainerFactory;

public class ModelGenerator {

	public static Resource createAndSaveModel(String outputPath, int option) {

		URI uri = URI.createFileURI(outputPath);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();

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
		TestcasesModelFactory entityfactory = TestcasesModelFactory.eINSTANCE;
		ReactionContainerFactory containerFactory = ReactionContainerFactory.eINSTANCE;
		Container container = containerFactory.createContainer();
		U_s us = entityfactory.createU_s();
		P_s ps = entityfactory.createP_s();
		container.getStates().add(us);
		container.getStates().add(ps);

		List<Agent> agents = new LinkedList<>();
		// Create free agents
		boolean tUnphosDone = false;
		for (int i = 0; i < 100; i++) {
			A a = entityfactory.createA();
			X x = entityfactory.createX();

			if (!tUnphosDone) {
				a.setA_c_u(us);
				x.setX_z_u(us);
			} else {
				a.setA_c_p(ps);
				x.setX_z_p(ps);
			}
			if (i == 49) {
				tUnphosDone = true;
			}
			agents.add(a);
			agents.add(x);
		}
		
		for(int i=0; i < 20; i++) {
			T t = entityfactory.createT();
			agents.add(t);
		}

		// create bound configurations
		for (int i = 0; i < 10; i++) {
			A a1 = entityfactory.createA();
			X x1 = entityfactory.createX();
			a1.setA_b(x1);
			x1.setX_y(a1);
			a1.setA_c_u(us);
			x1.setX_z_u(us);
			agents.add(a1);
			agents.add(x1);

			A a2 = entityfactory.createA();
			X x2 = entityfactory.createX();
			a2.setA_b(x2);
			a2.setA_c_u(us);
			x2.setX_z(a2);
			x2.setX_z_u(us);
			agents.add(a2);
			agents.add(x2);

			A a3 = entityfactory.createA();
			X x3 = entityfactory.createX();
			a3.setA_c(x3);
			a3.setA_c_u(us);
			x3.setX_y(a3);
			x3.setX_z_u(us);
			agents.add(a3);
			agents.add(x3);

			A a4 = entityfactory.createA();
			X x4 = entityfactory.createX();
			a4.setA_c(x4);
			a4.setA_c_u(us);
			x4.setX_z(a4);
			x4.setX_z_u(us);
			agents.add(a4);
			agents.add(x4);

			A at1 = entityfactory.createA();
			T t1 = entityfactory.createT();
			at1.setA_b(t1);
			at1.setA_c_u(us);
			t1.setT_i(at1);
			agents.add(t1);
			agents.add(at1);

			A at2 = entityfactory.createA();
			T t2 = entityfactory.createT();
			at2.setA_b(t2);
			at2.setA_c_u(us);
			t2.setT_i(at2);
			agents.add(t2);
			agents.add(at2);
		}

		// match especially for "bidirectionalRule":
		for (int i = 0; i < 17; i++) {
			A a = entityfactory.createA();
			T t = entityfactory.createT();
			X x1 = entityfactory.createX();
			X x2 = entityfactory.createX(); // just for matching a.c bound to anything

			a.setA_b(t);
			t.setT_j(a);

			a.setA_c(x2);
			a.setA_c_u(us);
			x2.setX_y(a);
			x2.setX_z_u(us);

			t.setT_i(x1);
			x1.setX_z(t);
			x1.setX_z_p(ps);

			agents.add(a);
			agents.add(t);
			agents.add(x1);
			agents.add(x2);
		}

		// match especially for "bidirectionalRuleBwd":
		for (int i = 0; i < 11; i++) {
			A a = entityfactory.createA();
			T t = entityfactory.createT();
			X x = entityfactory.createX();

			t.setT_j(x);
			x.setX_z(t);
			x.setX_z_u(us);

			agents.add(a);
			agents.add(t);
			agents.add(x);
		}

		// some a.b+x.z(p)
		for (int i = 0; i < 13; i++) {
			A a = entityfactory.createA();
			X x = entityfactory.createX();

			a.setA_b(x);
			a.setA_c_u(us);
			x.setX_z(a);
			x.setX_z_p(ps);

			agents.add(a);
			agents.add(x);
		}

		// some a.c(p)+t.i and a.c(u)+t.i
		boolean acpti = false;
		for (int i = 0; i < 27; i++) {
			A a = entityfactory.createA();
			T t = entityfactory.createT();

			a.setA_c(t);
			if(acpti) {
				a.setA_c_p(ps);
			}else {
				a.setA_c_u(us);
			}
			
			t.setT_i(a);

			agents.add(a);
			agents.add(t);
			
			if (i == 14)
				acpti = true;
		}
		
		// some a.c(u)+x.y and a.c(p)+x.z(p)
		boolean acxyHalf = false;
		for(int i=0; i < 7; i++) {
			
			A a = entityfactory.createA();
			X x = entityfactory.createX();
			
			a.setA_c(x);
			if(acxyHalf) {
				a.setA_c_p(ps);
				x.setX_z(a);
				x.setX_z_p(ps);
			}else {
				a.setA_c_u(us);
				x.setX_y(a);
			}
			
			agents.add(a);
			agents.add(x);
			
			if(i == 3) {
				acxyHalf = true;
			}
		}
		
		//some a1.b+x.y, a2.c+x.z
		for(int i=0; i< 5; i++) {
			A a1= entityfactory.createA();
			A a2= entityfactory.createA();
			X x = entityfactory.createX();
			
			x.setX_y(a1);
			x.setX_z(a2);
			x.setX_z_u(us);
			a1.setA_b(x);
			a1.setA_c_u(us);
			a2.setA_c(x);
			a2.setA_c_u(us);
			
			agents.add(x);
			agents.add(a1);
			agents.add(a2);
		}
		
		//some a.c(u)+x.z(p)
		for(int i=0; i < 9 ;i++) {
			A a = entityfactory.createA();
			X x = entityfactory.createX();
			
			a.setA_c(x);
			a.setA_c_u(us);
			x.setX_z(a);
			x.setX_z_p(ps);
			
			agents.add(a);
			agents.add(x);
		}

		container.getAgents().addAll(agents);
		return container;
	}

}
