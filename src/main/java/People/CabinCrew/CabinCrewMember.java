package People.CabinCrew;

import People.Person;

public class CabinCrewMember extends Person {
    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String canTalk(){

        return "Hello this is your "+getRank()+" speaking";
    }
}
