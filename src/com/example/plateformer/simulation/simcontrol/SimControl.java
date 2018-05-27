package com.example.plateformer.simulation.simcontrol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.example.plateformer.simulation.ai.BotAI;
import com.example.plateformer.simulation.ai.PlayerAI;
import com.example.plateformer.simulation.logic.GameLogic;
import com.example.plateformer.simulation.logic.Physics;

import javafx.scene.input.KeyCode;

public class SimControl implements PropertyChangeListener {
	
	private BotAI botAI = new BotAI();
	
	private PlayerAI playerAI = new PlayerAI();
	
	private GameLogic gameLogic = new GameLogic();	
	
	private Physics physics = new Physics();

	public BotAI getBotAI() {
		return botAI;
	}

	public PlayerAI getPlayerAI() {
		return playerAI;
	}

	public GameLogic getGameLogic() {
		return gameLogic;
	}

	public Physics getPhysics() {
		return physics;
	}	

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		System.out.println("simControl " + event.getNewValue());
		playerAI.computeDecision((KeyCode) event.getNewValue());
	}
	
}
