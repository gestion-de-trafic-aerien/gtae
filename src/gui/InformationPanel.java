package gui;

/*
 * This panel dedicated to the informations relative to various flights:
 * IDs and time informations
 * Airport status
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InformationPanel extends JPanel {
	private JLabel airportLabel;
	private JTextField ALG;
	private JTextField PRS;
	private JTextField WDC;
	private JTextField CBR;
	private JTextField BRZ;
	private JTextField MSW;
	private JLabel ALGLabel;
	private JLabel PRSLabel;
	private JLabel WDClabel;
	private JLabel CBRlabel;
	private JLabel BRZlabel;
	private JLabel MSWlabel;

	public InformationPanel() {
		airportLabel= new JLabel("Status of airports :");
		ALGLabel=new JLabel("ALGIERS airport :");
		PRSLabel=new JLabel("PARIS airport :");
		WDClabel=new JLabel("WASHINGTON airport :");
		CBRlabel=new JLabel("CANEBERRA airport :");
		BRZlabel=new JLabel("BRAZILIA airport :");
		MSWlabel=new JLabel("MOSCOW airport :");
		ALG=new JTextField();
		PRS=new JTextField();
		WDC=new JTextField();
		CBR=new JTextField();
		BRZ=new JTextField();
		MSW=new JTextField();


		ALG.setEditable(false);
		PRS.setEditable(false);
		WDC.setEditable(false);
		CBR.setEditable(false);;
		BRZ.setEditable(false);;
		MSW.setEditable(false);;
		
		
		setLabelCaracteristics();
		setPanelCaracteristics();        
	}
	
	
	public JLabel getAirportLabel() {
		return airportLabel;
	}


	public void setALG(String text) {
		this.ALG.setText(text);
	}


	public void setPRS(String text) {
		this.PRS.setText(text);
	}


	public void setWDC(String text) {
		this.WDC.setText(text);
	}


	public void setCBR(String text) {
		this.CBR.setText(text);
	}


	public void setBRZ(String text) {
		 this.BRZ.setText(text);
	}


	public void setMSW(String text) {
		this.MSW.setText(text);
	}


	public void setLabelCaracteristics() {
		this.airportLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		this.airportLabel.setBounds(200, 60, 100, 29);
		this.airportLabel.setForeground(Color.BLACK);		
	}
	public void setPanelCaracteristics(){
		this.setBackground(Color.green);
		this.setLocation(700, 0);
		this.setSize(500,200);
		this.setVisible(true);
		this.setLayout(new GridLayout(7,2));
		this.add(airportLabel);
		this.add( new JLabel());
		this.add(ALGLabel);
		this.add(ALG);

		this.add(PRSLabel);
		this.add(PRS);

		this.add(WDClabel);
		this.add(WDC);

		this.add(CBRlabel);
		this.add(CBR);

		this.add(BRZlabel);
		this.add(BRZ);

		this.add(MSWlabel);
		this.add(MSW);
	}
}

