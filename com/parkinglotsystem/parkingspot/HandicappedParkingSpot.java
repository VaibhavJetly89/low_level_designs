package com.parkinglotsystem.parkingspot;

public class HandicappedParkingSpot implements ParkingSpot {
	final private int id;

	public HandicappedParkingSpot(int id) {
		super();
		this.id = id;
	}

	@Override
	public ParkingType getParkingType() {

		return ParkingType.Handicapped;
	}

	@Override
	public int getId() {

		return id;
	}
}
