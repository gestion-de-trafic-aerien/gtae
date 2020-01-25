package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class FlightsListPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		
	@SuppressWarnings({ "rawtypes" })
	public FlightsListPanel () {
		JComboBox flightsList = new JComboBox();
		flightsList.setFont(new Font("FontAwesome", Font.BOLD, 12));
		flightsList.setMaximumRowCount(10);
		flightsList.setForeground(Color.WHITE);
		flightsList.setBackground(Color.LIGHT_GRAY);
		
		
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);  
		JButton showFlightButton=new JButton("Show");
		this.setVisible(true);
		showFlightButton.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String data = "Informations of the flight: "+ flightsList.getSelectedItem().toString();  
	        	label.setText(data);  
	        }  
		});
	              
	    
		
	}
}