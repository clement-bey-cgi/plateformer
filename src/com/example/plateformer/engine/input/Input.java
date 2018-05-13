package com.example.plateformer.engine.input;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Input {

	private PropertyChangeSupport support;	
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);	
    }
}
