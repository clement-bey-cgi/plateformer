package com.example.plateformer.engine.graphics.hero.animations;

import com.example.plateformer.engine.graphics.hero.HeroGroup;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class RunningAnimation extends Transition {
	
	private static int width = HeroGroup.getFrameWidth();
	
	private static int height = HeroGroup.getFrameHeight();
	
	private static int frameNumberInSprite = HeroGroup.getFrameNumberInSprite();
	
	private HeroGroup heroGroup;
	
	private final ImageView imageView;

	public RunningAnimation(HeroGroup heroGroup) {
		this.heroGroup = heroGroup;
		this.imageView = heroGroup.getImageView();
		this.setCycleCount(1);
		this.setAutoReverse(false);
		this.setCycleDuration(Duration.millis(800));
	}

	@Override
	protected void interpolate(double animationPourcentage) {
		// TODO g�rer les changements de direction
		final int currentFrameIndex = (int) Math.floor(animationPourcentage * frameNumberInSprite);
		this.imageView.viewportProperty().set(new Rectangle2D(currentFrameIndex * width, 0, width, height));
		this.imageView.translateXProperty().set(this.imageView.getTranslateX() + 2);
		if (animationPourcentage == 1.0) {
			this.imageView.viewportProperty().set(new Rectangle2D(0, 0, width, height));
		}
	}
}
