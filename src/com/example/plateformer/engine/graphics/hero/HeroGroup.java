package com.example.plateformer.engine.graphics.hero;

import java.beans.PropertyChangeEvent;

import com.example.plateformer.PropertiesNames;
import com.example.plateformer.engine.graphics.RootGroup;
import com.example.plateformer.engine.graphics.hero.animations.RunningAnimation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class HeroGroup extends Parent {
	
	private static Image image = new Image("com/example/plateformer/resources/hero.png");
	
	private static int frameNumberInSprite = 8;
	
	private static int frameWidth = 70;
	
	private static int frameHeight = 105;
	
	private ImageView imageView = new ImageView();
	
	private RootGroup root;
	
	private RunningAnimation heroRunningAnimation = new RunningAnimation(this);
	
	public HeroGroup(RootGroup rootGroup) {
		this.imageView.setImage(image);
		this.imageView.setViewport(new Rectangle2D(0, 0, 70, 105));
		this.root = rootGroup;
		this.getChildren().add(this.imageView);
		this.root.getChildren().add(this);
		System.out.println("Hero créé !");
	}

	public void handleObjectSystemChanges(PropertyChangeEvent event) {
		if (event.getPropertyName().contains(PropertiesNames.PLAYER_X_POSITION)) {
			handleHorizontalMove(event);
		}
	}
	
	private void handleHorizontalMove(PropertyChangeEvent event){
		heroRunningAnimation.play();
		
//		Timeline timeline = new Timeline();
//		timeline.getKeyFrames().add(new KeyFrame(Duration.millis(800), 
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(70, 0, 70, 105)),
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(140, 0, 70, 105)),
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(210, 0, 70, 105)),
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(280, 0, 70, 105)),
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(350, 0, 70, 105)),
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(420, 0, 70, 105)),
//				new KeyValue(this.imageView.viewportProperty(), new Rectangle2D(490, 0, 70, 105))));
//		timeline.setCycleCount(Timeline.INDEFINITE);
//		timeline.setAutoReverse(true);
//		timeline.play();
	}
	
	// ----------------------------- GETTERS SETTERS -----------------------------
	
	public RootGroup getRoot() {
		return root;
	}

	public static Image getImage() {
		return image;
	}

	public static void setImage(Image image) {
		HeroGroup.image = image;
	}

	public ImageView getImageView() {
		return imageView;
	}

	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
	}

	public void setRoot(RootGroup root) {
		this.root = root;
	}

	public RunningAnimation getHeroTimeline() {
		return heroRunningAnimation;
	}

	public void setHeroTimeline(RunningAnimation heroTimeline) {
		this.heroRunningAnimation = heroTimeline;
	}

	public static int getFrameNumberInSprite() {
		return frameNumberInSprite;
	}

	public static void setFrameNumberInSprite(int frameNumberInSprite) {
		HeroGroup.frameNumberInSprite = frameNumberInSprite;
	}

	public static int getFrameWidth() {
		return frameWidth;
	}

	public static void setFrameWidth(int frameWidth) {
		HeroGroup.frameWidth = frameWidth;
	}

	public static int getFrameHeight() {
		return frameHeight;
	}

	public static void setFrameHeight(int frameHeight) {
		HeroGroup.frameHeight = frameHeight;
	}

	public RunningAnimation getHeroRunningAnimation() {
		return heroRunningAnimation;
	}

	public void setHeroRunningAnimation(RunningAnimation heroRunningAnimation) {
		this.heroRunningAnimation = heroRunningAnimation;
	}
	
}
