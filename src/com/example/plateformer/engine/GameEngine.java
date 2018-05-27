package com.example.plateformer.engine;

import com.example.plateformer.engine.audio.Audio;
import com.example.plateformer.engine.graphics.RootGroup;
import com.example.plateformer.engine.input.MyScene;
import com.example.plateformer.engine.osinterface.OsInterface;
import com.example.plateformer.simulation.Simulation;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class GameEngine extends Application {

	private static final long serialVersionUID = 1L;

	private static Audio audio = new Audio();
	
	private static OsInterface osInterface = new OsInterface();
	
	private static MyScene scene = new MyScene(new RootGroup(), 800, 800);
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.centerOnScreen();
        stage.setTitle("Plateformer");
        stage.setScene(scene);
        stage.show();
	}
	
	public static void main(String [ ] args) {
		Simulation simulation = new Simulation();
		scene.addPropertyChangeListener(simulation.getSimControl());
		
		Application.launch(GameEngine.class, args);
	}

	public Audio getAudio() {
		return audio;
	}

	public OsInterface getOsInterface() {
		return osInterface;
	}
}

//EventQueue.invokeLater(() -> {
//// Initialisation des composants
//GameEngine engine = new GameEngine();
//DataManager dataManager = new DataManager();
//Simulation simulation = new Simulation();
//ObjectSystem objectSystem = new ObjectSystem();
//
//// Mise en place des 
//engine.getMyPanel().getInput().addPropertyChangeListener(simulation.getSimControl());
//});
//Timer timer = new Timer();
//TimerTask task = new TimerTask() {
//@Override
//public void run() {
//	myPanel.repaint();
//System.out.println("Tour");
//}
//};
//timer.scheduleAtFixedRate(task, 1000, 100);

//this.setContentPane(myPanel);
//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//this.setVisible(true);
//this.setSize(1000,750);
//this.setLocationRelativeTo(null);
//this.setTitle("Jeu 2D");