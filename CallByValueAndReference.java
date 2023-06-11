public class CallByValueAndReference {

    // Call by value example
    public static void increment(int x) {
        x++;
        System.out.println("Tassu Agarwal");
        System.out.println("09429802021");
        System.out.println("Inside increment method, x = " + x);
    }

    // Call by reference example
    public static void changeName(String[] arr) {
        arr[0] = "Tassu";
        System.out.println("Inside changeName method, name = " + arr[0]);
    }

    public static void main(String[] args) {
        // Call by value example
        int a = 5;
        increment(a);
        System.out.println("Outside increment method, a = " + a);

        // Call by reference example
        String[] names = { "Tassu Agarwal" };
        changeName(names);
        System.out.println("Outside changeName method, name = " + names[0]);
    }
}
