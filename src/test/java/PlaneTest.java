import Plane.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("BOEING_747",10, 500);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals("BOEING_747",plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(10,plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(500,plane.getPlaneWeight());
    }


}
