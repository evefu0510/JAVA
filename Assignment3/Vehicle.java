
//Create a class named Vehicle
public class Vehicle {

    //1) Create 3 instance variables with unique data types and unique accessibility levels to represent the following attributes of a vehicle
    //-color
    //-number of doors
    //-gas powered
    public String color;
    int numberOfDoors;
    private double gasPowered;

   //2) Create 4 constructors with parameters + the default constructor (5 marks)
    public Vehicle() {
    }
    public Vehicle(String color) {
        this.color = color;
    }
    public Vehicle(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public Vehicle(double gasPowered) {
        this.gasPowered = gasPowered;
    }
    public Vehicle(String color, int numberOfDoors, double gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }


    //3) Create the necessary getters and setters for this class (1 mark)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(double gasPowered) {
        this.gasPowered = gasPowered;
    }

    //4) Override (not Overload) the equals() method so it evaluates two Vehicle objects and returns true if and only if (iff) the two Vehicle objects are equal is value (2 marks)
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberOfDoors ==vehicle.numberOfDoors && Double.compare(vehicle.gasPowered, gasPowered) ==0 && color.equals(vehicle.color);
    }


    //5) Override the toString method to summarize all instance variables of the class (1 mark)
    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }

    //6) Create a method named isEcoFriendly. It has no parameters. It determines whether the Vehicle is two-doored and is not gas powered. (2 marks)
     public boolean isEcoFriendly(){
        return numberOfDoors == 2 && gasPowered ==0;
     }
}
