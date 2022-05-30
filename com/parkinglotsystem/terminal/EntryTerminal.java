package com.parkinglotsystem.terminal;

import com.parkinglotsystem.parkingassignmentstrategies.ParkingAssignmentStrategy;
import com.parkinglotsystem.parkingspot.ParkingSpot;
import com.parkinglotsystem.parkingspot.ParkingType;
import com.parkinglotsystem.ticket.ParkingTicket;

public class EntryTerminal implements Terminal {

	public EntryTerminal(int id) {
		super();
		this.id = id;
	}

	private int id;

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	public ParkingTicket getParkingTicket(ParkingType parkingType, ParkingAssignmentStrategy mystrategy) {
		ParkingTicket parkingTicket = new ParkingTicket();
		ParkingSpot parkingSpot = mystrategy.getParkingSpot(this);
		parkingTicket.setParkingSlotId(parkingSpot.getId());
		return parkingTicket;
	}

}
