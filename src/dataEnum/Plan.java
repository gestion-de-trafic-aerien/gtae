package dataEnum;

import java.util.ArrayList;

import data.Position;

public class Plan {
	private ArrayList<Position> plan;

	public Plan() {
		super();
		this.plan =new ArrayList<Position>();
		for(int i=0;i<700;i++) {
			for(int j=0;j<500;j++) {
				plan.add(new Position(i, j));
			}
		}
	}
	public Position getPos(int x, int y) {
		Position pos =null;
		for(Position pos1 : plan) {
			if (pos1.getX()==x && pos1.getY()==y) {
				 pos=pos1;
			}
		}
		return pos;
	}
	
}
