package com.example.plateformer.engine.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javafx.scene.input.KeyCode;

public class Input implements KeyListener {

	private PropertyChangeSupport support;
	
	private char keyPressed;
	
	private char keyReleased;
	
	private char keyTyped;
	
	public Input() {
		this.support = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);	
    }

	@Override
	public void keyPressed(KeyEvent event) {
		this.keyPressed = event.getKeyChar();
		support.firePropertyChange("keyPressed", this.keyPressed, event.getKeyChar());
		System.out.println("key pressed");
	}

	@Override
	public void keyReleased(KeyEvent event) {
		this.keyReleased = event.getKeyChar();
		support.firePropertyChange("keyReleased", this.keyReleased, event.getKeyChar());
	}

	@Override
	public void keyTyped(KeyEvent event) {
		this.keyTyped = event.getKeyChar();
		support.firePropertyChange("keyTyped", this.keyTyped, event.getKeyChar());
	}
}
