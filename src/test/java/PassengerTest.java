import People.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
         passenger = new Passenger ("Patrick", 4);
    }

    @Test
    public void passengerHasName(){

        assertEquals("Patrick", passenger.getName());
    }


    @Test
    public void passengerHasBags(){

        assertEquals(4, passenger.getBags());
    }



}
