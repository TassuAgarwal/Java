import java.util.Scanner;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class NumberChecker {
    public static void main(String[] args) {
        try {
            int number = getNumberFromUser();
            checkNumber(number);
            System.out.println("Number is 10!");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tassu Agarwal");
        System.out.println("09429802021");
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private static void checkNumber(int number) throws NoMatchException {
        if (number != 10) {
            throw new NoMatchException("Number is not 10!");
        }
    }
}
