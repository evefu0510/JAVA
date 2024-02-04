//Create a class named Truck that is based on the Vehicle class
public class Truck extends Vehicle {
//1) Create two additional instance variables with unique non-private accessibility levels and data
//types to represent the following attributes of a truck
//-seats
//-trunk space
   protected int numberOfSeats;
    double truckSpace;


//2) Create 8 constructors (8 marks)
//a) The default constructor
    public Truck() {
    }


//b) 4 constructors that mirror the constructors of the Vehicle class
    public Truck(String color) {
        super(color);
    }
    public Truck(int numberOfDoors) {
        super(numberOfDoors);
    }
    public Truck(double gasPowered) {
        super(gasPowered);
    }
    public Truck(String color, int numberOfDoors, double gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }


//c) A constructor with 3 instance variables of Vehicle & seats instance variable of Truck
    public Truck(String color, int numberOfDoors, double gasPowered, int numberOfSeats) {
        super(color, numberOfDoors, gasPowered);
        this.numberOfSeats = numberOfSeats;
    }


//d) A constructor with 3 instance variables of Vehicle & trunk space instance variable of Truck
    public Truck(String color, int numberOfDoors, double gasPowered, double truckSpace) {
        super(color, numberOfDoors, gasPowered);
        this.truckSpace = truckSpace;
    }


//e) A constructor with 3 instance variables of Vehicle & both instance variables of Truck
    public Truck(String color, int numberOfDoors, double gasPowered, int numberOfSeats, double truckSpace) {
        super(color, numberOfDoors, gasPowered);
        this.numberOfSeats = numberOfSeats;
        this.truckSpace = truckSpace;
    }


//3) Override (not Overload) the equals() method so it evaluates two Truck objects and returns true
//if and only if (iff) the two Truck objects are equal is value. (3 marks) **
@Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(!super.equals(obj)) return false;
        Truck truck = (Truck)  obj;
        return numberOfSeats == truck.numberOfSeats && truckSpace == truck.truckSpace;
    }


//4) Override the toString method to summarize all instance variables of the class (3 marks) **
//**Please note, there are 5 instance variables to evaluate and/or summarize **
@Override
public String toString() {
    return "Truck{" +
            super.toString() +
            ", seats=" + numberOfSeats +
            ", trunkSpace=" + truckSpace +
            '}';
}


//5) Override the isEcoFriendly method. In addition to its original behavior, it also determines if the Truck has at most two seats and has no trunk space. (5 marks)
@Override
public boolean isEcoFriendly() {
    boolean isVehicleEcoFriendly = super.isEcoFriendly();
    boolean isTruckEcoFriendly = numberOfSeats <= 2 && truckSpace == 0;
    return isVehicleEcoFriendly && isTruckEcoFriendly;
}
}





