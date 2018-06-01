package com.example.plateformer.simulation.simcontrol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.example.plateformer.objectsystem.ObjectSystem;
import com.example.plateformer.simulation.ai.BotAI;
import com.example.plateformer.simulation.ai.PlayerAI;
import com.example.plateformer.simulation.logic.GameLogic;
import com.example.plateformer.simulation.logic.Physics;

import javafx.scene.input.KeyCode;

public class SimControl implements PropertyChangeListener {
	
	private BotAI botAI;
	
	private PlayerAI playerAI;
	
	private GameLogic gameLogic;	
	
	private Physics physics;

	public SimControl(ObjectSystem objectSystem) {
		this.playerAI = new PlayerAI(objectSystem);
	}

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
