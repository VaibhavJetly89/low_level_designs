package com.parkinglotsystem.parkingassignmentstrategies;

import com.parkinglotsystem.parkingspot.ParkingSpot;
import com.parkinglotsystem.terminal.Terminal;

public interface ParkingAssignmentStrategy {
	ParkingSpot getParkingSpot(Terminal terminal);
	void releaseParkingSpot(ParkingSpot parkingSpot);
}
