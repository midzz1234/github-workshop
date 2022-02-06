import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give the first value a: ");
        int a = Integer.parseInt( scanner.nextLine() );

        System.out.print("Please give the first value b: ");
        int b = Integer.parseInt( scanner.nextLine() );

        System.out.println(a + " + " + b + " = " + sum(a, b));
    }

    static int sum( int a, int b ) {
        int sum = a + b;
        return sum;
    }
}
