public class ques17 {
    public static void main(String[] args) {
        System.out.println("Tassu Agarwal");
        System.out.println("09429802021");
        try {
            int num = 4, deno = 0;
            int quotient = num / deno;
            System.out.println(quotient);
        } catch (ArithmeticException e) {
            System.out.println("Not defined");
        } finally {
            System.out.println("All exception handled");
        }
    }
}