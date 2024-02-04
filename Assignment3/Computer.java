//Computer Class: 6 marks
//1) Create concrete class named Computer
//2) Base this class on the abstract Keyboard class (1 mark)
//3) This class is to implement the Button interface (1 mark)
//a) Complete the interface method bodies (2 x 2 marks)
//4) Be creative while coding. Unrelated or inapplicable entities will not count.
//a) E.G., do not code myMethod() or myValue

public class Computer extends Keyboard implements Button {
    private String currentMode;
    private String color;

    public Computer(String brand, boolean wireless, BacklitOption backlit, String currentMode, String color) {
        super(brand, wireless, backlit);
        this.currentMode = currentMode;
        this.color = color;
    }

    // Implementation specific to Bluetooth functionality
    @Override
    public void blueToothButton() {
        System.out.println("Bluetooth button pressed. Searching for devices...");
    }

    // Implementation specific to backlight functionality
    @Override
    public void backlitButton() {
        System.out.println("Backlit button pressed. Adjusting backlight settings...");
    }

    // Implementation of the changeMode() method from the Keyboard abstract class
    @Override
    public void changeMode() {
        System.out.println("Changing mode...");

    }

    // Implementation of the changeBacklitColor() method from the Keyboard abstract class
    @Override
    public void changeBacklitColor() {
        System.out.println("Changing backlight color...");

    }
}
