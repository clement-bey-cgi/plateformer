package com.example.plateformer.engine;

import java.awt.EventQueue;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import com.example.plateformer.datamanager.DataManager;
import com.example.plateformer.engine.audio.Audio;
import com.example.plateformer.engine.graphics.RootGroup;
import com.example.plateformer.engine.input.Input;
import com.example.plateformer.engine.osinterface.OsInterface;
import com.example.plateformer.objectsystem.ObjectSystem;
import com.example.plateformer.simulation.Simulation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GameEngine extends Application{

	private static final long serialVersionUID = 1L;

	private static Audio audio = new Audio();
	
	private static OsInterface osInterface = new OsInterface();
	
	private static Input input = new Input();
	
	private static RootGroup root = new RootGroup();
	
	public GameEngine() {}
	
	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("Méthode start lancée");
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Plateformer");
        stage.setScene(scene);
        stage.show();
	}
	
	public static void main(String [ ] args) {
		System.out.println("DEBUT DU MAIN");
		
		Application.launch(GameEngine.class, args);
		
		System.out.println("FIN DU MAIN");
	}
	
	public Input getInput() {
		return input;
	}

	public Audio getAudio() {
		return audio;
	}

	public OsInterface getOsInterface() {
		return osInterface;
	}
	
	public void print(String string) {
		System.out.println(string);
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