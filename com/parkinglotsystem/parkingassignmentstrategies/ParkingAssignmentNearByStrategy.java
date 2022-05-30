package com.parkinglotsystem.parkingassignmentstrategies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import com.parkinglotsystem.parkingspot.ParkingSpot;
import com.parkinglotsystem.parkingspot.ParkingspotWithDistanceFromTerminal;
import com.parkinglotsystem.terminal.Terminal;

public class ParkingAssignmentNearByStrategy implements ParkingAssignmentStrategy {
	private Map<Terminal, PriorityQueue<ParkingspotWithDistanceFromTerminal>> mymap;
	
	private List<ParkingspotWithDistanceFromTerminal>  mybooked = new ArrayList<>();

	@Override
	public ParkingSpot getParkingSpot(Terminal terminal) {
		PriorityQueue<ParkingspotWithDistanceFromTerminal> pq = mymap.get(terminal);
		ParkingSpot ps =pq.poll().getParkingSpot();
		
		mymap.values().stream().forEach(e-> { e.forEach(s-> {if (s.getParkingSpot()==ps) mybooked.add})}
			);;
		return ps;
	}

	public ParkingAssignmentNearByStrategy(Map<Terminal, PriorityQueue<ParkingspotWithDistanceFromTerminal>> mymap) {
		super();
		this.mymap = mymap;
	}

	@Override
	public void releaseParkingSpot(ParkingSpot parkingSpot) {
		mybooked

	}

}
