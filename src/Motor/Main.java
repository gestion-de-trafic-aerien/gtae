package Motor;

import javax.swing.JFrame;


import gui.Radar;
public class Main {
	 static Controller controller=new Controller();
	 public static Radar radar;
	public static void main(String[] args) {
		JFrame fenetre =new JFrame("Simulation of Air Trafic");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1000,800);
		
		new Thread(new Simulator()).start();
		
		radar=new Radar();
		fenetre.setContentPane(radar);
		fenetre.setVisible(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
			
		//System.out.println(data.getWaitingPlanes());
		//Simulator simulator= new Simulator(data, controller);
		//simulator.run();
		
		

	    
	}

	  
		
		
	}
