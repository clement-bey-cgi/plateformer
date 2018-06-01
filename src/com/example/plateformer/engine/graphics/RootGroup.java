package com.example.plateformer.engine.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RootGroup extends Group implements PropertyChangeListener {
	// TODO REFLECHIR AUX HISTOIRE DE CONTEXTE SINON CA VA ETRE LA MERDE
	private Circle hero = new Circle(400, 750, 50, Color.BLUEVIOLET);
	
	public RootGroup() {
		super();
		System.out.println("RootGroup créé !");
		this.getChildren().add(this.hero);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// Comment dispacter les actions ? 
		if (event.getPropertyName().equals("posX")) {
			System.out.println("L ECRAN LAFFICHE" + event.getNewValue());
			makeHeroMove((Integer) event.getNewValue());
		}
	}

	private void makeHeroMove(Integer posX) {
		if (this.hero != null) {
			this.hero.setCenterX(posX);
		}
	}

}
