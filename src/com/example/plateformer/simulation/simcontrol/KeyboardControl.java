package com.example.plateformer.simulation.simcontrol;

import java.util.HashMap;
import java.util.Map;

public enum KeyboardControl {
	
	Random('e', Action.Random);
	
	private char KeyCode;
	
	private Action action;
	
	private static Map<Character, Action> controls = new HashMap<>();
	
	static {
		for (KeyboardControl control : KeyboardControl.values()) {
			controls.put(control.getKeyCode(), control.getAction());
		}
	}

	private KeyboardControl(char keyCode, Action action) {
		KeyCode = keyCode;
		this.action = action;
	}

	public static Action getActionFromChar(Character value) {
		return controls.get(value);
	}

	public char getKeyCode() {
		return KeyCode;
	}

	public void setKeyCode(char keyCode) {
		KeyCode = keyCode;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
}