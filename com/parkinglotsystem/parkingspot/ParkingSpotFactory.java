package com.parkinglotsystem.parkingspot;

public class ParkingSpotFactory {

	public static ParkingSpot getParkingSpotInstance(ParkingType pt, int id) {
		switch (pt) {
		case Compact:
			return new CompactParkingSpot(id);
		case Large:
			return new LargeParkingSpot(id);
		case Handicapped:
			return new HandicappedParkingSpot(id);
		case MotorCycle:
			return new MotorCycleParkingSpot(id);
		default:
			return new CompactParkingSpot(id);
		}
	}

}
