package com.example.plateformer.engine.graphics;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.example.plateformer.PropertiesNames;
import com.example.plateformer.engine.graphics.hero.HeroGroup;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RootGroup extends Group implements PropertyChangeListener {
	
	private HeroGroup heroGroup = new HeroGroup(this);
	
	public RootGroup() {
		super();
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// Comment dispacter les actions ? 
		if (event.getPropertyName().contains(PropertiesNames.PLAYER_PROPERTIES)) {
			System.out.println("L ECRAN LAFFICHE" + event.getNewValue());
			this.heroGroup.handleObjectSystemChanges(event);
		}
	}
}
