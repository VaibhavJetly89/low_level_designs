package com.parkinglotsystem.parkingspot;

public class MotorCycleParkingSpot implements ParkingSpot {

	final private int id;

	@Override
	public ParkingType getParkingType() {

		return ParkingType.MotorCycle;
	}

	public MotorCycleParkingSpot(int id) {
		super();
		this.id = id;
	}

	@Override
	public int getId() {

		return id;
	}
}
