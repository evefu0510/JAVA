// 7) Create an interface named Button (1 mark)
public interface Button {
//8) Code two constant values (2 marks)
    int BLUETOOTH_DEVICE_1 = 1;
    int BLUETOOTH_DEVICE_2 = 2;

//9) Code two methods (2 marks)
    void blueToothButton();
    void backlitButton();

    //after java 8, we can use default...
    default void turnOnDevice(){
        System.out.println("Your device turned on");
    }
    default void turnOffDevice(){
        System.out.println("Your device turned off");
    }

}

//10) Be creative while coding. Unrelated or inapplicable entities will not count.
//a) E.G., do not code myMethod() or myValue