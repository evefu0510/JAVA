import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        task1();
        task4(); // Call the task4 method on the instance

    }

    //Task1:
    public static Object[] task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements would you like to create? ");
        int length = scanner.nextInt();

        Object[] task1Array = new Object[length];

        // In a loop, ask the user to enter a value for each element of the array
        for (int i = 0; i < length; i++) {
            System.out.print("Enter value for each element: ");
            int value = scanner.nextInt();
            // If the value is either 0 or 1 -> Convert the value to a Boolean
            if (value == 0 || value == 1) {
                boolean boolValue = (value == 1);
                System.out.println("Converted to Boolean: " + boolValue);
                task1Array[i] = boolValue;
            }
            // If the value is within the byte range -> Convert the value to a byte
            else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                byte byteValue = (byte) value;
                System.out.println("Converted to byte: " + byteValue);
                task1Array[i] = byteValue;
            }
            // If the value is within the short range -> Convert the value to a short
            else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                short shortValue = (short) value;
                System.out.println("Converted to short: " + shortValue);
                task1Array[i] = shortValue;
            }
            // If the value is outside the ranges mentioned above -> Print as an integer
            else {
                System.out.println("Value as an integer: " + value);
                task1Array[i] = value;
            }
        }

        // Print the array before returning it
        System.out.print("Task 1 Array: ");
        for (int i = 0; i < task1Array.length; i++) {
            System.out.print(task1Array[i] + " ");
        }
        System.out.println();

        return task1Array;
    }

    //Task2:
    //This method takes one parameter of integer array. (1 mark)
    //Using any loop, output all the values of your array to the Console. (2 marks)
    public static void task2(int[] array) {
        System.out.print("New array value: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //task3:
    //This method takes one parameter of integer array.
    //In a loop that starts at the beginning of the array to the end of the array, ask the user for a number to populate each index of the array.
    public static int[] task3(int[] task3Array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < task3Array.length; i++) {
            System.out.print("Please input No." + (i + 1) + " number: ");
            int value = scanner.nextInt();
            task3Array[i] = value;
        }
        return task3Array;
    }

    //Task4:
    //Ask the user for a number that represents the number of elements they would like in their array.
    //Create an integer array with the specified # of elements (from user input above), then call the task3 method and the task2 method

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements would you like in the new array? ");
        int length = scanner.nextInt();
        int[] newTask4Array = new int[length];
        newTask4Array = task3(newTask4Array);
        task2(newTask4Array);
    }
}
