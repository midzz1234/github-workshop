import java.util.Scanner;

public class Main {

    // Main method that is invoked when the application is started
    public static void main(String[] args) {
        startUserInterface();
    }

    // This method implements the user interface of the application.
    static void startUserInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give the first value a: ");
        int a = Integer.parseInt( scanner.nextLine() );

        System.out.print("Please give the first value b: ");
        int b = Integer.parseInt( scanner.nextLine() );

        // Use the method sum
        System.out.println(a + " + " + b + " = " + sum(a, b));

        // Use the method mul
        System.out.println(a + " * " + b + " = " + mul(a, b));
    }

    // Method returns the integer sum of two integers.
    static int sum( int a, int b ) {
        int sum = a + b;
        return sum;
    }

    // Method returns the interger sum of two integers.
    static int mul( int a, int b ) {
        int mul = a * b;
        return mul;
    }

}
