package com.example.plateformer.simulation.simcontrol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.example.plateformer.simulation.ai.BotAI;
import com.example.plateformer.simulation.ai.PlayerAI;
import com.example.plateformer.simulation.logic.GameLogic;
import com.example.plateformer.simulation.logic.Physics;

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
		dispatch(KeyboardControl.getActionFromChar((Character) event.getNewValue()));
	}
	
	private void dispatch(Action action) {
		if (Action.Random.equals(action)) {
			System.out.println("appuye");
		}
	}
	
}
