package com.parkinglotsystem.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import com.parkinglotsystem.parkingassignmentstrategies.ParkingAssignmentNearByStrategy;
import com.parkinglotsystem.parkingassignmentstrategies.ParkingAssignmentStrategy;
import com.parkinglotsystem.parkingspot.ParkingSpot;
import com.parkinglotsystem.parkingspot.ParkingSpotFactory;
import com.parkinglotsystem.parkingspot.ParkingType;
import com.parkinglotsystem.parkingspot.ParkingspotWithDistanceFromTerminal;
import com.parkinglotsystem.terminal.EntryTerminal;
import com.parkinglotsystem.terminal.Terminal;
import com.parkinglotsystem.ticket.ParkingTicket;

public class ParkingLotSystem {

	ParkingAssignmentStrategy mystrategy = null;

	ParkingSpot parkingSpot1 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 1);
	ParkingSpot parkingSpot2 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 2);
	ParkingSpot parkingSpot3 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 3);
	ParkingSpot parkingSpot4 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 4);
	ParkingSpot parkingSpot5 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 5);
	ParkingSpot parkingSpot6 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 6);
	ParkingSpot parkingSpot7 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 7);
	ParkingSpot parkingSpot8 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 8);
	ParkingSpot parkingSpot9 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 9);
	ParkingSpot parkingSpot10 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 10);
	ParkingSpot parkingSpot11 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 11);
	ParkingSpot parkingSpot12 = ParkingSpotFactory.getParkingSpotInstance(ParkingType.Compact, 12);

	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot1 = new ParkingspotWithDistanceFromTerminal(parkingSpot1,
			2);
	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot2 = new ParkingspotWithDistanceFromTerminal(parkingSpot2,
			1);
	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot3 = new ParkingspotWithDistanceFromTerminal(parkingSpot3,
			1);
	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot4 = new ParkingspotWithDistanceFromTerminal(parkingSpot4,
			2);

	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot9 = new ParkingspotWithDistanceFromTerminal(parkingSpot9,
			4);
	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot10 = new ParkingspotWithDistanceFromTerminal(parkingSpot10,
			3);
	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot11 = new ParkingspotWithDistanceFromTerminal(parkingSpot11,
			3);
	ParkingspotWithDistanceFromTerminal terminal1ParkingSpot12 = new ParkingspotWithDistanceFromTerminal(parkingSpot12,
			4);

	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot1 = new ParkingspotWithDistanceFromTerminal(parkingSpot1,
			4);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot2 = new ParkingspotWithDistanceFromTerminal(parkingSpot2,
			3);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot3 = new ParkingspotWithDistanceFromTerminal(parkingSpot3,
			3);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot4 = new ParkingspotWithDistanceFromTerminal(parkingSpot4,
			4);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot9 = new ParkingspotWithDistanceFromTerminal(parkingSpot9,
			2);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot10 = new ParkingspotWithDistanceFromTerminal(parkingSpot10,
			1);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot11 = new ParkingspotWithDistanceFromTerminal(parkingSpot11,
			1);
	ParkingspotWithDistanceFromTerminal terminal2ParkingSpot12 = new ParkingspotWithDistanceFromTerminal(parkingSpot12,
			2);

	Map<Terminal, PriorityQueue<ParkingspotWithDistanceFromTerminal>> mymap = new HashMap<Terminal, PriorityQueue<ParkingspotWithDistanceFromTerminal>>();
	PriorityQueue<ParkingspotWithDistanceFromTerminal> myque = null;

	private List<EntryTerminal> entryTerminals = new ArrayList<>();
	private List<Terminal> exitTerminals = new ArrayList<>();

	public ParkingLotSystem(int numberOfTerminals) {
		super();
		EntryTerminal entryTerminal;
		for (int x = 1; x <= numberOfTerminals; x++) {
			entryTerminal = new EntryTerminal(x);
			if (x == 1) {
				myque = new PriorityQueue<ParkingspotWithDistanceFromTerminal>();
				myque.add(terminal1ParkingSpot1);
				myque.add(terminal1ParkingSpot2);
				myque.add(terminal1ParkingSpot3);
				myque.add(terminal1ParkingSpot4);
				myque.add(terminal1ParkingSpot9);
				myque.add(terminal1ParkingSpot10);
				myque.add(terminal1ParkingSpot11);
				myque.add(terminal1ParkingSpot12);
			} else if (x == 2) {
				myque = new PriorityQueue<ParkingspotWithDistanceFromTerminal>();
				myque.add(terminal2ParkingSpot1);
				myque.add(terminal2ParkingSpot2);
				myque.add(terminal2ParkingSpot3);
				myque.add(terminal2ParkingSpot4);
				myque.add(terminal2ParkingSpot9);
				myque.add(terminal2ParkingSpot10);
				myque.add(terminal2ParkingSpot11);
				myque.add(terminal2ParkingSpot12);
			}
			entryTerminals.add(entryTerminal);
			mymap.put(entryTerminal, myque);

		}
		mystrategy = new ParkingAssignmentNearByStrategy(mymap);

	}

	public static void main(String[] args) {
		ParkingLotSystem parkingLotSystem = new ParkingLotSystem(2);

		List<EntryTerminal> entryTerminals = parkingLotSystem.getEntryTerminals();

		ParkingTicket firstcompactSlotTerminal1 = entryTerminals.get(0).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(firstcompactSlotTerminal1.getParkingSlotId());
		ParkingTicket secondcompactSlotTerminal1 = entryTerminals.get(0).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(secondcompactSlotTerminal1.getParkingSlotId());
		ParkingTicket thirdcompactSlotTerminal1 = entryTerminals.get(0).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(thirdcompactSlotTerminal1.getParkingSlotId());
		ParkingTicket forthcompactSlotTerminal1 = entryTerminals.get(0).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(forthcompactSlotTerminal1.getParkingSlotId());

		ParkingTicket firstcompactSlotTerminal2 = entryTerminals.get(1).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(firstcompactSlotTerminal2.getParkingSlotId());
		ParkingTicket secondcompactSlotTerminal2 = entryTerminals.get(1).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(secondcompactSlotTerminal2.getParkingSlotId());
		ParkingTicket thirdcompactSlotTerminal2 = entryTerminals.get(1).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(thirdcompactSlotTerminal2.getParkingSlotId());
		ParkingTicket forthcompactSlotTerminal2 = entryTerminals.get(1).getParkingTicket(ParkingType.Compact,
				parkingLotSystem.mystrategy);
		System.out.println(forthcompactSlotTerminal2.getParkingSlotId());

	}

	public Map<Terminal, PriorityQueue<ParkingspotWithDistanceFromTerminal>> getMymap() {
		return mymap;
	}

	public List<EntryTerminal> getEntryTerminals() {
		return entryTerminals;
	}

	public List<Terminal> getExitTerminals() {
		return exitTerminals;
	}

}
