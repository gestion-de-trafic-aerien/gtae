package Motor;



import javax.swing.JFrame;

import gui.InformationPanel;
import gui.Radar;
public class Main {
	 static Controller controller=new Controller();
	 public static Radar radar;
	public static void main(String[] args) {
		JFrame fenetre =new JFrame("Simulation of Air Trafic");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1000,800);
		
	    fenetre.setLayout(null);		
		radar=new Radar();
		InformationPanel info=new InformationPanel();
		fenetre.getContentPane().add(radar);
		fenetre.getContentPane().add(info);
		fenetre.setVisible(true);
		fenetre.setVisible(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		new Thread(new Simulator()).start();


	    
	}

	  
		
		
	}
