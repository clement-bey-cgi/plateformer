package com.example.plateformer.simulation.ai;

import com.example.plateformer.objectsystem.ObjectSystem;
import com.example.plateformer.simulation.simcontrol.PlayerDecision;

import javafx.scene.input.KeyCode;

public class PlayerAI {
	
	private ObjectSystem objectSystem;

	public PlayerAI(ObjectSystem objectSystem) {
		this.objectSystem = objectSystem;
	}

	public void computeDecision(KeyCode keyCode) {
		PlayerDecision decision = PlayerDecision.getPlayerDecisionFromKeyCode(keyCode);
		if (decision != null) {
			switch (decision) {
				case MoveLeft : 
					System.out.println("Le joueur se déplace à gauche !");
					// TODO COMMENT IMPLEMENTER CA PRORPE ? 
					objectSystem.getPlayer().setPosX(objectSystem.getPlayer().getPosX() - 1);
					break;
				case MoveRight :
					objectSystem.getPlayer().setPosX(objectSystem.getPlayer().getPosX() + 1);
					break;
				default : 
					break;
			}
		}
	}
	
	public ObjectSystem getObjectSystem() {
		return this.objectSystem;
	}
}
