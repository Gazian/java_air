import Flight.Flight;
import People.CabinCrew.CabinCrewMember;
import People.CabinCrew.Pilot;
import People.CabinCrew.Rank;
import People.Passenger.Passenger;
import Plane.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        plane = new Plane("BOEING747",3,75);
        pilot = new Pilot("Freddie", Rank.CAPTAIN, "PL_001");
        cabinCrewMember1 = new CabinCrewMember("Alice",Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Polly",Rank.PURSER);
        flight = new Flight(plane,pilot,cabinCrewMember1,"FR756","Faro","Edinburgh","0930");
        passenger = new Passenger("Patrick",4);
        passenger2 = new Passenger("Polly",2);
        passenger3 = new Passenger("Penny",2);
        passenger4 = new Passenger("Pedro",2);
    }

    @Test
    public void passengerCountStartsAt0(){
        assertEquals(0,flight.passengerCount());
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1,flight.passengerCount());
    }

    @Test
    public void cantAddPassengersPastCapacity(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(3,flight.passengerCount());
    }

    @Test
    public void canReturnAvailableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        assertEquals(1,flight.getSeatAvailability());
    }

}
