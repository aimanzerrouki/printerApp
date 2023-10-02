public class PrinterApp {
    public static void main(String[] args) {
        // Task 4: Declare a string typed variable and assign your name to it.
        String creator = "Your Name"; // Replace with your actual name.

        // Task 2 and 3: Print "Printer App" and "This app is made by:".
        System.out.println("Printer App");
        System.out.println("This app is made by:");

        // Task 5: Print the value of the creator on the same line as "This app is made by:".
        System.out.print("This app is made by: " + creator);

        // Task 6: Declare two numeric variables and assign values.
        int number1 = 5;
        int number2 = 3;

        // Task 7: Print the value of number1.
        // System.out.println(number1); // Commented out as per the task.

        // Task 8: Print "The value of number1 is ..." with the actual value of number1.
        System.out.println("\nThe value of number1 is " + number1);

        // Task 9: Print "The value of number2 is ..." with the actual value of number2.
        System.out.println("The value of number2 is " + number2);

        // Task 10: Declare an integer variable called multiplication and calculate the result.
        int multiplication = number1 * number2;

        // Task 12: Print the result of multiplication.
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        // Task 13: Repeat for addition, division, and subtraction.
        int addition = number1 + number2;
        double division = (double) number1 / number2; // Using double for accurate division.
        int subtraction = number1 - number2;

        // Print results for addition, division, and subtraction.
        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
