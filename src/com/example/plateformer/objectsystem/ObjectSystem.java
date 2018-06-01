package com.example.plateformer.objectsystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.example.plateformer.objectsystem.player.Player;

public class ObjectSystem {
	
	// TODO Chaque objet est �cout� par l'objectSystem qui fait le delta ? ou chaque objet est li� direct � l'engine ? ...
	
	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	private Player player = new Player(this);
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		this.support.addPropertyChangeListener(pcl);
	}
	
	public Player  getPlayer() {
		return this.player;
	}
	
	public PropertyChangeSupport getPropertyChangeSupport() {
		return this.support;
	}
}
