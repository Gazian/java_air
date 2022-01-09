import People.CabinCrew.CabinCrewMember;
import People.CabinCrew.Pilot;
import People.CabinCrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Freddie", Rank.CAPTAIN, "PILOT_001");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Freddie", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("PILOT_001", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanTalk(){
        assertEquals("Hello this is your "+Rank.CAPTAIN+" speaking", pilot.canTalk());
    }
}
