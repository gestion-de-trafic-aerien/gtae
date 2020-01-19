package Motor;

import java.util.TimerTask;
public class Chrono extends TimerTask {
	
	private int hour ;
	private int minute ;
	
	
 
	
	public Chrono(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}

	


	public int getHour() {
		return hour;
	}




	public int getMinute() {
		return minute;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		minute ++;
		if(minute == 60){
			hour ++;
			minute = 0;
			
		}

	}

}
