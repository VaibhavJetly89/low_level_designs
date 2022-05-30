package com.parkinglotsystem.terminal;

import com.parkinglotsystem.ticket.ParkingTicket;

public class ExitTerminal implements Terminal {
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

	public int acceptParkingTicket(ParkingTicket parkingTicket) {
		return 0;

	}
}
