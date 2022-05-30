package com.parkinglotsystem.parkingspot;

public class LargeParkingSpot implements ParkingSpot {

	final private int id;

	public LargeParkingSpot(int id) {
		super();
		this.id = id;
	}

	@Override
	public ParkingType getParkingType() {

		return ParkingType.Large;
	}

	@Override
	public int getId() {

		return id;
	}

}
