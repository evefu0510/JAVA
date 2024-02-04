public class Main {
    public static void main(String[] args) {
        //testing
        Computer computer = new Computer("Brand", true, Keyboard.BacklitOption.LOW, "Model1", "White");

        computer.blueToothButton();
        computer.backlitButton();
        computer.turnOnDevice();
        computer.turnOffDevice();

        computer.changeBacklitColor();
        computer.changeMode();
        computer.firstActiveGreeting();
        computer.connectionCheck();
    }
}
