package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Location loc  = new Location(5,6);
		Flower flower = new Flower();
		Color color = new Color(0,0,255);
		
		world.show();
		world.add(loc, bug);
		world.add(loc, bug);
		bug.setColor(color);
		bug.turn();
		bug.turn();
		for(int i=0; i<10; i++) {
		for(int b=0; b<10; b++) {
			Location loc2 = new Location(i,b);
			Flower flower2 = new Flower();
			world.add(loc2, flower2);
			
		
		//add flower at the location in the world
		//world.add(loc, flower);
	}
	
}
}
}
