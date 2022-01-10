package Plane;

public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int weight;

    public Plane(PlaneType planeType, int capacity, int weight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getPlaneCapacity(){
        return this.capacity;
    }

    public int getPlaneWeight(){
        return this.weight;
    }

}
