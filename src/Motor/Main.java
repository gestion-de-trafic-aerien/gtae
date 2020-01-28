package Motor;

import javax.swing.JFrame;

import data.GlobaleData;
import gui.DashBoardPanel;
import gui.InformationPanel;
import gui.Radar;

public class Main {
	public static Controller controller;
	public static Radar radar;
	public static InformationPanel informationPanel;
	public static void main(String[] args) {
		GlobaleData data=new GlobaleData();
		JFrame fenetre =new JFrame("Simulation of Air Trafic");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1200,700);		
		fenetre.setLayout(null);	
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		radar = new Radar(data);
		informationPanel=new InformationPanel();
		DashBoardPanel dashboard = new DashBoardPanel();
		fenetre.getContentPane().add(dashboard);
		fenetre.getContentPane().add(radar);
		fenetre.getContentPane().add(informationPanel);
		fenetre.setVisible(true);
		controller=new Controller(data);
		new Thread(new Simulator(data)).start();



	}




}
