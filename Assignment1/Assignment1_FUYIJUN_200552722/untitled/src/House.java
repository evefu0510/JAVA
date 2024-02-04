public class House {

    //Unique data types
    public int numberOfRooms, numberOfBathrooms, numberOfBedrooms;
    public byte doors, story;
    public boolean basement, backyard;
    public String location;
    public float buildingArea;
    public double distanceToCollege;
    public char level;

    //Unique accessibility levels
    protected String ownerName;
    private double housePrice;

    //create seven constructors
    public byte getDoors() {
        return doors;
    }

    public int getNumberOfRooms(){
        numberOfRooms = numberOfBathrooms + numberOfBathrooms;
        return numberOfRooms;
    }

    public char getLevel() {
        if (numberOfRooms > 3) {
            level = 'H';
        } else {
            level = 'L';
        }
        return level;
    }

    // the default constructors
    public House() {
        ownerName = "Null";
        numberOfBedrooms = 0;
        numberOfBathrooms = 0;
        housePrice = 0.0F;
    }
    //Instantiate the House object in 3 unique ways (using 3 unique constructors)
    public House(String ownerName, int numberOfBedrooms, int numberOfBathrooms, double housePrice) {
        this.ownerName = ownerName;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.housePrice = housePrice;
    }

    public House(byte story, boolean basement, boolean backyard)  {
        this.story = story;
        this.basement = basement;
        this.backyard = backyard;
    }

    public House(String location, float buildingArea, double distanceToCollege) {
        this.location = location;
        this.buildingArea = buildingArea;
        this.distanceToCollege = distanceToCollege;
    }

    //Using printf, output the values of all three instance variables of the 3 House objects. (9 printf statements in total)
    public static class HouseRunner {
        public static void main(String[] args) {
            System.out.println("----Task 5&6: House ----");
            House house1 = new House("Evelyn", 5, 2, 1000000.00);
            System.out.printf("House 1:%nOwner: %s%n", house1.ownerName);
            System.out.printf("Bedrooms: %d%n", house1.numberOfBedrooms);
            System.out.printf("Bathrooms: %d%n", house1.numberOfBathrooms);
            System.out.printf("Price: $ %.2f%n",house1.housePrice);
            System.out.println(" ");
            House information = new House((byte)2,  true, true);
            System.out.printf("More information:%nStory: %d%n", information.story);
            System.out.printf("Basement: %b, Backyard: %b%n", information.basement, information.backyard);
            System.out.println(" ");
            House detail = new House("Barrie", 350.75f, 20.75);
            System.out.printf("More details:%nLocation: %s%n", detail.location);
            System.out.printf("Building area: %.2f m²%n", detail.buildingArea);
            System.out.printf("Distance to College: %.2f km%n", detail.distanceToCollege);

        }
    }
}
