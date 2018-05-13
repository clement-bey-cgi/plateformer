package com.example.plateformer.engine;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.example.plateformer.engine.audio.Audio;
import com.example.plateformer.engine.graphics.MyGraphics;
import com.example.plateformer.engine.input.Input;
import com.example.plateformer.engine.osinterface.OsInterface;

public class GameEngine {
	
	private MyGraphics myGraphics;
	
	private Audio audio;
	
	private Input input;
	
	private OsInterface osInterface;
	
	public GameEngine() {
		this.myGraphics = new MyGraphics();
	}
	
}
