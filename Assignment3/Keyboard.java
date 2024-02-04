public abstract class Keyboard {
    //7) In the abstract class, code two (2) of the items below
    public enum BacklitOption {
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }


    //a) instance variables (2 marks)
    public String brand;
    private boolean wireless;
    protected BacklitOption backlit;
    protected int numKeys;


    //b) concrete methods (2 marks)
    public void firstActiveGreeting(){
        System.out.println("Welcome to use Logi Keyboard! ");
    }
    public void connectionCheck(){
        if (wireless){
            System.out.println("Your keyboard bluetooth connected to your device! ");
        }else {
            System.out.println("Connection lost!");
        }
    }


    //c) abstract methods (2 marks)
    public abstract void changeBacklitColor();
    public abstract void changeMode();


    //d) constructors (2 marks)
    public Keyboard(String brand, boolean wireless, BacklitOption backlit) {
        this.brand = brand;
        this.wireless = wireless;
        this.backlit = backlit;
    }

    public Keyboard(String brand, boolean wireless, BacklitOption backlit, int numKeys) {
        this.brand = brand;
        this.wireless = wireless;
        this.backlit = backlit;
        this.numKeys = numKeys;
    }








//8) Be creative while coding. Unrelated or inapplicable entities will not count.
    //a) E.G., do not code myMethod() or myValue


}
