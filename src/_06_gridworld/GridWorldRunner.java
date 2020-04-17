package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Location location  = new Location(5,6);
		Flower flower = new Flower();
		
		world.show();
		bug.getLocation();
	}
	
}
