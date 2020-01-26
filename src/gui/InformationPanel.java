package gui;

import java.awt.Color;import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Motor.ControllerDataInterface;
import Motor.Simulator;
import data.Airport;
import data.GlobaleData;
import data.Plane;
import dataEnum.AirportID;


@SuppressWarnings("serial")
public class InformationPanel extends JPanel {

	private ControllerDataInterface data;

	public InformationPanel(ControllerDataInterface data) {
		this.data=data;
		this.setBackground(Color.green);
		this.setLocation(700, 0);
		this.setSize(500,800);
		this.setVisible(true);
		JLabel airportLabel = new JLabel("Status of airports :");
		airportLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		airportLabel.setBounds(200, 60, 100, 29);
		airportLabel.setForeground(Color.BLACK);
				
		JTextField ALG=new JTextField();
		JTextField PRS=new JTextField();
		JTextField WDC=new JTextField();
		JTextField CBR=new JTextField();
		JTextField BRZ=new JTextField();
		JTextField MSW=new JTextField();
		
		ArrayList<Plane> planesInFlight= data.getWaitingPlanes();
		JComboBox<ArrayList<Plane>> planesInFlightList = new JComboBox<ArrayList<Plane>>();
		planesInFlightList.setFont(new Font("FontAwesome", Font.BOLD, 12));
		planesInFlightList.setMaximumRowCount(10);
		planesInFlightList.setForeground(Color.WHITE);
		planesInFlightList.setBackground(Color.LIGHT_GRAY);
		planesInFlightList.addItem(planesInFlight);
		
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);  
		JButton show=new JButton("Show");
		
		this.add(airportLabel);
		this.add(ALG);
		this.add(PRS);
		this.add(WDC);
		this.add(CBR);
		this.add(BRZ);
		this.add(MSW);
		this.add(planesInFlightList);
		this.add(label);
		this.add(show);
		
		ALG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.ALGIERS)){
						ALG.setText(airport.toString());
					}
				}				
			}
		});
		PRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.PARIS)){
						PRS.setText(airport.toString());
					}
				}				
			}
		});
		WDC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.WASHINGTON)){
						WDC.setText(airport.toString());
					}
				}				
			}
		});
		BRZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.BRAZILIA)){
						BRZ.setText(airport.toString());
					}
				}
				
			}
		});
		CBR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.CANBERRA)){
						CBR.setText(airport.toString());
					}
				}
				
			}
		});
		MSW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.MOSCOW)){
						MSW.setText(airport.toString());
						
					}
				}
				
			}
		});
		
		show.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String data = "Informations of the flight: "+ planesInFlightList.getSelectedItem().toString();  
	        	label.setText(data);  
	        }  
		});
	        
	}
}

