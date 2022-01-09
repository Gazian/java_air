package People.Passenger;

import People.Person;

public class Passenger extends Person {
    private int bags;

    public Passenger(String name, Integer bags) {
        super(name);
        this.bags = bags;
    }

    public int getBags(){
        return this.bags;
    }

}
