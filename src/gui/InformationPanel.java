package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Motor.Simulator;
import data.Airport;
import dataEnum.AirportID;


@SuppressWarnings("serial")
public class InformationPanel extends JPanel {

	public InformationPanel() {
		this.setBackground(Color.white);
		this.setLayout(new GridLayout(20,1));
		this.setLocation(700, 0);
		this.setSize(300, 800);
		this.setVisible(true);	
		JLabel airportLabel = new JLabel("status of airports :");
		airportLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		airportLabel.setBounds(200, 60, 100, 29);
		airportLabel.setForeground(Color.BLACK);
		JButton paris = new JButton("Paris Airport");
		JButton algiers = new JButton("Algiers Airport");
		JButton moscow = new JButton("Moscow Airport");
		JButton brazilia = new JButton("Brazilia Airport");
		JButton caneberra = new JButton("Canberra Airport");
		JButton washington = new JButton("Washington Airport");
		JTextField field=new JTextField();
		this.add(airportLabel);
		this.add(algiers);
		this.add(paris);
		this.add(moscow);
		this.add(brazilia);
		this.add(washington);
		this.add(caneberra);
		this.add(field);
		algiers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : Simulator.data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.ALGIERS)){
						field.setText(airport.toString());
					}
				}
				
			}
		});
		washington.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : Simulator.data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.WASHINGTON)){
						field.setText(airport.toString());
					}
				}
				
			}
		});
		paris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : Simulator.data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.PARIS)){
						field.setText(airport.toString());
					}
				}
				
			}
		});
		caneberra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : Simulator.data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.CANBERRA)){
						field.setText(airport.toString());
					}
				}
				
			}
		});
		brazilia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : Simulator.data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.BRAZILIA)){
						field.setText(airport.toString());
					}
				}
				
			}
		});
		moscow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Airport airport : Simulator.data.getAirports() ) {
					if(airport.getAirportID().equals(AirportID.MOSCOW)){
						field.setText(airport.toString());
						
					}
				}
				
			}
		});
	}
}
