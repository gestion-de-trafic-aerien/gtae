package Motor;

import javax.swing.JFrame;
import gui.DashBoardPanel;
import gui.InformationPanel;
import gui.Radar;

public class Main {
	static Controller controller=new Controller();
	public static Radar radar;
	public static void main(String[] args) {
		new Thread(new Simulator()).start();

		JFrame fenetre =new JFrame("Simulation of Air Trafic");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1200,800);		
		fenetre.setLayout(null);	
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		radar = new Radar();
		InformationPanel info=new InformationPanel();
		DashBoardPanel dashboard = new DashBoardPanel();
		fenetre.getContentPane().add(dashboard);
		fenetre.getContentPane().add(radar);
		fenetre.getContentPane().add(info);
		fenetre.setVisible(true);



	}




}
