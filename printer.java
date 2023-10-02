public class PrinterApp {
    public static void main(String[] args) {
        String creator = "Your Name"; 
        System.out.println("Printer App");
        System.out.println("This app is made by:");

        System.out.print("This app is made by: " + creator);

        int number1 = 5;
        int number2 = 3;


        System.out.println("\nThe value of number1 is " + number1);

        System.out.println("The value of number2 is " + number2);

        int multiplication = number1 * number2;

        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        int addition = number1 + number2;
        double division = (double) number1 / number2; 
        int subtraction = number1 - number2;

        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
