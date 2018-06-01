package com.example.plateformer.simulation.simcontrol;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.input.KeyCode;

public enum PlayerDecision {
	MoveLeft(KeyCode.LEFT), 
	MoveRight(KeyCode.RIGHT);
	
	private KeyCode keycode;
	
	/** Allow others class to get a player decision by keyCode. */
	private static Map<KeyCode, PlayerDecision> decisions = new HashMap<>();
	
	static {
		for (PlayerDecision decision : PlayerDecision.values()) {
			decisions.put(decision.getKeycode(), decision);
		}
	}

	public static PlayerDecision getPlayerDecisionFromKeyCode(KeyCode keyCode) {
		return decisions.get(keyCode);
	}

	
	/**Getters, Setters, Constructors...*/
	public KeyCode getKeycode() {
		return keycode;
	}
	
	private PlayerDecision(KeyCode keycode) {
		this.keycode = keycode;
	}
}
