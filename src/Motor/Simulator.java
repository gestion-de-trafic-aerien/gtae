package Motor;
import data.Airport;
import data.GlobaleData;
import data.Plane;
import java.util.Date;
import java.util.Timer;
public class Simulator implements Runnable  {
	

	private GlobaleData data;
	public Simulator(GlobaleData data) {
		super();
		this.data = data;
	
	}

	private void setInformationPanel() {
		Main.informationPanel.setALG(data.getAirports().get(0).getRunways().toString());
		Main.informationPanel.setBRZ(data.getAirports().get(1).getRunways().toString());
		Main.informationPanel.setPRS(data.getAirports().get(2).getRunways().toString());
		Main.informationPanel.setMSW(data.getAirports().get(3).getRunways().toString());
		Main.informationPanel.setWDC(data.getAirports().get(4).getRunways().toString());
		Main.informationPanel.setCBR(data.getAirports().get(5).getRunways().toString());		
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		Timer timer=new Timer();
		Chrono chrono = new Chrono(0, 0);
		timer.schedule(chrono, 1000, 1000);
		Date date;
		while(chrono.getHour()<24) {
			date=new Date(2020, 01, 21, chrono.getHour(), chrono.getMinute(),0);
			System.out.println(date);
			Main.radar.repaint();
			setInformationPanel();
			for(Plane plane : data.getWaitingPlanes()) {
				if(plane.getFlight().getDepartureDate().equals(date)) {
					new Thread(new SimulateFlight(plane)).start();
					try {
						Thread.currentThread().join(0, 10);;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	




	
}
