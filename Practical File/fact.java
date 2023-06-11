public class fact {

    public static void main(String[] args) {

        int num = 5;

        int result = factorial(num);

        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");
        System.out.println("Factorial of " + num + " is " + result);

    }

    public static int factorial(int n) {
        if (n == 0) {

            return 1;

        } else {

            return n * factorial(n - 1);

        }
    }
}
