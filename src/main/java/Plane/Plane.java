package Plane;

public class Plane {

    private String planeType;
    private int capacity;
    private int weight;

    public Plane(String planeType, int capacity, int weight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getPlaneType(){
        return this.planeType;
    }

    public int getPlaneCapacity(){
        return this.capacity;
    }

    public int getPlaneWeight(){
        return this.weight;
    }

}
