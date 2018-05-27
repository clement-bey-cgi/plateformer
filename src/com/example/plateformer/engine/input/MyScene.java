package com.example.plateformer.engine.input;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MyScene extends Scene {
	
	private PropertyChangeSupport support;
	
	private KeyCode keyPressed;
	
	private KeyCode keyReleased;
	
	private KeyCode keyTyped;
	
	// TODO Stocker le root groupe comme un attribut ? 

	public MyScene(Parent root, double width, double height) {
		super(root, width, height);
		
		this.support = new PropertyChangeSupport(this);
		
		setEventHandlers();
	}
	
	private void setEventHandlers() {
        this.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				handleKeyEvent(event);
			}
		});
	}
	
	private void handleKeyEvent(KeyEvent event) {
		KeyCode newKey = event.getCode();
		
		if (event.isShiftDown()) {
			System.out.println("shift" + event.getCode());
		}
		else {
			System.out.println(event.getCode());
		}

		support.firePropertyChange("keyPressed", this.keyPressed, newKey);	
		this.keyPressed = newKey;
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
}
