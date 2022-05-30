package com.parkinglotsystem.parkingspot;

public class CompactParkingSpot implements ParkingSpot {
	final private int id;

	public CompactParkingSpot(int id) {
		super();
		this.id = id;
	}

	@Override
	public ParkingType getParkingType() {

		return ParkingType.Compact;
	}

	@Override
	public int getId() {

		return id;
	}

}
