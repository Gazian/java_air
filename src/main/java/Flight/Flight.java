package Flight;

import People.Passenger.Passenger;
import Plane.Plane;
import People.CabinCrew.CabinCrewMember;
import People.CabinCrew.Pilot;

import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight (Plane plane, Pilot pilot, CabinCrewMember cabinCrewMember, String flightNo, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengerCount() < plane.getPlaneCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public int getSeatAvailability(){
        return plane.getPlaneCapacity() - this.passengers.size();
    }


}

