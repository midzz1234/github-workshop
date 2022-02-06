import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<CalculationInterface> calculations;

    // Main method that is invoked when the application is started
    public static void main(String[] args) {
        // Initialize the static variable calculations
        calculations = new ArrayList<>();

        // Add all the required calculations to the array
        calculations.add(new Summation());
        calculations.add(new Multiplication());

        // Start the user interface of the application
        startUserInterface();
    }

    // This method implements the user interface of the application.
    static void startUserInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give the first value a: ");
        int a = Integer.parseInt( scanner.nextLine() );

        System.out.print("Please give the first value b: ");
        int b = Integer.parseInt( scanner.nextLine() );

        // Show all the calculations
        for ( CalculationInterface calc : calculations ) {
            System.out.println(a + " " + calc.symbol() + " " + b + " = " + calc.calculate(a, b));
        }
    }
}
