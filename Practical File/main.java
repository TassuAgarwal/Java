import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");

        int num2 = sc.nextInt();

        try {

            int result = num1 / num2;

            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Program completed.");

        }
    }

}