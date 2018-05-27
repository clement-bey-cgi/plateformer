package com.example.plateformer.simulation;

import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.example.plateformer.simulation.ai.BotAI;
import com.example.plateformer.simulation.ai.PlayerAI;
import com.example.plateformer.simulation.logic.GameLogic;
import com.example.plateformer.simulation.logic.Physics;
import com.example.plateformer.simulation.simcontrol.SimControl;

public class Simulation {

	private SimControl simControl;
	
	public SimControl getSimControl() {
		return simControl;
	}
}
