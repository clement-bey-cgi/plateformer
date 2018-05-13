package com.example.plateformer.engine.graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGraphics extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel jpanel = new JPanel();
	
	public MyGraphics(){
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setTitle("Plateformer");
		this.setContentPane(jpanel);
	}
}
