package Motor;

import data.GlobaleData;

public class Main {
	public static void main(String[] args) {
		Controller controller=new Controller();
		GlobaleData data= new GlobaleData();
		//System.out.println(data.getWaitingPlanes());
		//Simulator simulator= new Simulator(data, controller);
		//simulator.run();
		new Thread(new Simulator(data,controller)).start();
		  	

	    
	}

	  
		
		
	}
