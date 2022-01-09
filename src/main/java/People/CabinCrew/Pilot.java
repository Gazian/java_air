package People.CabinCrew;

public class Pilot extends CabinCrewMember{

    private String licenceNumber;

    public Pilot (String name, Rank rank, String licenceNumber){
        super (name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber(){
        return this.licenceNumber;
    }

    public String canTalk(){

        return "Hello this is your "+getRank()+" speaking";
    }
}
