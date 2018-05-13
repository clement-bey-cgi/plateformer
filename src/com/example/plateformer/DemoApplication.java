package com.example.plateformer;

import com.example.plateformer.datamanager.DataManager;
import com.example.plateformer.engine.GameEngine;
import com.example.plateformer.objectsystem.ObjectSystem;
import com.example.plateformer.simulation.Simulation;

public class DemoApplication {
	
	private static ObjectSystem objectSystem;
	
	private static GameEngine gameEngine;
	
	private static Simulation simulation;
	
	private static DataManager dataManager;

	public static void main(String[] args) {
		begin();
		
		
		
		end();
	}
	
	// --------------------------------------------------------------
	// -------------------METHODE DE STYLE---------------------------

	public static void print(String string) {
		System.out.println(string);
	}
	
	public static void begin() {
		print("");
		print("----------------------------------");
		print("----------------------------------");
		print("DEBUT DU PROGRAMME !");
		print("");
	}
	
	public static void end() {
		print("");
		print("FIN DU PROGRAMME !");
		print("----------------------------------");
		print("----------------------------------");
		print("");
	}
}
