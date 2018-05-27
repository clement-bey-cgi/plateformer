package com.example.plateformer.simulation.ai;

import com.example.plateformer.simulation.simcontrol.PlayerDecision;

import javafx.scene.input.KeyCode;

public class PlayerAI {

	public void computeDecision(KeyCode keyCode) {
		PlayerDecision decision = PlayerDecision.getPlayerDecisionFromKeyCode(keyCode);
		if (decision != null) {
			switch (decision) {
				case MoveLeft : 
					System.out.println("Le joueur se déplace à gauche !");
					break;
				default : 
					break;
			}
		}
	}
	
}
