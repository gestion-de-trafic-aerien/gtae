package gui;

/*
 * This panel dedicated to the various graphic maneuvers 
 * for controlling and managing incidents that may occur during flight
 * These incidents are: lack of fuel, collisions
 */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Plane;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import dataEnum.Status;
public  class DashBoardPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static int buttonNumber = -1;
	public static int number;
	private JLabel[] label;
	private JButton[] button;


	public DashBoardPanel () {
		//JLabel title=new JLabel(" dashbord");
		//title.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		//title.setBackground(Color.black);
		//this.add(title);

		this.setBackground(Color.cyan);
		this.setLocation(0, 500);
		this.setSize(700, 200);
		this.setVisible(true);
		

		GridLayout gl=new GridLayout(6, 2);
		this.setLayout(gl);
		
		label= new JLabel[5];
		button= new JButton[5];
		
		for(int i=0;i<5;i++) {
			label[i]=new JLabel();
			button[i]=new JButton("authorize");
			this.add(label[i]);
			this.add(button[i]);
			label[i].setVisible(false);
			button[i].setVisible(false);
			label[i].setBackground(Color.GREEN);
		}
		JLabel lab= new JLabel("Dashboard");
		lab.setVisible(false);
		this.add(lab);

		

	}
	public RunwayID respondTakeOff (Plane plane) {
		int k=DashBoardPanel.number;
		int i=0;
		RunwayID id =RunwayID.R1;
		while(!plane.getStatuts().equals(FlightStatus.AUTHORIZED_TO_TAKEOFF) && i<50 && id!= null) {
			id = plane.getFlight().getSource().freeRunway();
			if(id != null) {
				label[k].setText("do you athorize the flight "+plane.getFlight().getFlightID()+" to take off");
				label[k].setVisible(true);
				button[k].setVisible(true);
				button[k].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						plane.setStatuts(FlightStatus.AUTHORIZED_TO_TAKEOFF);
						
					}

				});
				try {
					Thread.currentThread().sleep(150);

				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			i++;
		}
		label[k].setVisible(false);
		button[k].setVisible(false);
		return id;


	}


	public RunwayID respondLanding (Plane plane) {

		int k=DashBoardPanel.number;
		int i=0;
		RunwayID id =RunwayID.R1;
		while(!plane.getStatuts().equals(FlightStatus.AUTHORIZED_TO_LAND) && i<50 && id!= null) {
			id = plane.getFlight().getDestination().freeRunway();
			if(id != null) {
				label[k].setText("do you athorize the flight "+plane.getFlight().getFlightID()+" to land ");
				label[k].setVisible(true);
				button[k].setVisible(true);
				button[k].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						plane.setStatuts(FlightStatus.AUTHORIZED_TO_LAND);
						
					}

				});
				try {
					Thread.currentThread().sleep(150);

				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			i++;
		}
		label[k].setVisible(false);
		button[k].setVisible(false);
		return id;

	}


}

