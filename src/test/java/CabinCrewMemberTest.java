import People.CabinCrew.CabinCrewMember;
import People.CabinCrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabincrewmember;

    @Before
    public void before(){
        cabincrewmember = new CabinCrewMember("Frankie", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Frankie", cabincrewmember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabincrewmember.getRank());
    }

    @Test
    public void flightAttendantCanTalk(){
        assertEquals("Hello this is your "+Rank.FLIGHT_ATTENDANT+" speaking", cabincrewmember.canTalk());
    }






}
