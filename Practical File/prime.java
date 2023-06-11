import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {

            isPrime = false;

        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;

                    break;
                }
            }
        }

        if (isPrime) {

            System.out.println(num + " is a prime number.");

        } else {

            System.out.println(num + " is not a prime number.");

        }
    }
}