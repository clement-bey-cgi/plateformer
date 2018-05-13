package com.example.plateformer.simulation;

import java.awt.event.KeyEvent;

import com.example.plateformer.simulation.ai.BotAI;
import com.example.plateformer.simulation.ai.PlayerAI;
import com.example.plateformer.simulation.logic.GameLogic;
import com.example.plateformer.simulation.logic.Physics;
import com.example.plateformer.simulation.simcontrol.SimControl;

public class Simulation {

	private SimControl simControl;
	
	private BotAI botAI;
	
	private PlayerAI playerAI;
	
	private GameLogic gameLogic;	
	
	private Physics physics;

	public Simulation(SimControl simControl, BotAI botAI, PlayerAI playerAI, GameLogic gameLogic, Physics physics) {
		super();
		this.simControl = simControl;
		this.botAI = botAI;
		this.playerAI = playerAI;
		this.gameLogic = gameLogic;
		this.physics = physics;
	}
	
	

}
