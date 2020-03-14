package dataEnum;

import data.Position;

public class Plan {
	private Position[][] plan;
	public Plan() {
		setPlan();
	}
	public Position getPosition(int x, int y) {
		return plan[x][y];
	}
	private void setPlan() {
		plan = new Position[1200][450];
		for(int i=0;i<1200;i++) {
			for(int j=0;j<450;j++) {
				plan[i][j]=new Position(i,j);
			}
		}

	}
	
}
