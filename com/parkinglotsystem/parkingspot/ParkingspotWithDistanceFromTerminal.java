package com.parkinglotsystem.parkingspot;

public class ParkingspotWithDistanceFromTerminal implements Comparable<ParkingspotWithDistanceFromTerminal> {
	final private ParkingSpot parkingSpot;
	final private int distanceFromTerminal;

	public ParkingspotWithDistanceFromTerminal(ParkingSpot parkingSpot, int distanceFromTerminal) {
		super();
		this.parkingSpot = parkingSpot;
		this.distanceFromTerminal = distanceFromTerminal;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public int getDistanceFromTerminal() {
		return distanceFromTerminal;
	}

	@Override
	public int compareTo(ParkingspotWithDistanceFromTerminal o) {
		if (this.distanceFromTerminal > o.distanceFromTerminal) {
			return 1;
		} else if (this.distanceFromTerminal == o.distanceFromTerminal) {
			return 0;
		} else
			return -1;
	}
}
