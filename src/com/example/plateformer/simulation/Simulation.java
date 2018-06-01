package com.example.plateformer.simulation;

import com.example.plateformer.objectsystem.ObjectSystem;
import com.example.plateformer.simulation.simcontrol.SimControl;

public class Simulation {

	private SimControl simControl;
	
	public Simulation(ObjectSystem objectSystem) {
		this.simControl = new SimControl(objectSystem);
	}

	public SimControl getSimControl() {
		return simControl;
	}
	
}
