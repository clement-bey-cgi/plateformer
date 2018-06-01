package com.example.plateformer.objectsystem.player;

import com.example.plateformer.objectsystem.ObjectSystem;

public class Player {
	
	private int posX = 0;
	
	private ObjectSystem objectSystem;

	public Player(ObjectSystem objectSystem) {
		this.objectSystem = objectSystem;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		objectSystem.getPropertyChangeSupport().firePropertyChange("posX", this.posX, posX);
		this.posX = posX;
		System.out.println("OBJECT SYSTEM MIS A JOUR ");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (posX != other.posX)
			return false;
		return true;
	}
	
	
}
