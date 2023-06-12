public class CallByValueAndReference {

    // Call by value example
    public static void increment(int x) {
        x++;
        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");
        System.out.println("Inside increment method, x = " + x);
    }

    // Call by reference example
    public static void changeName(String[] arr) {
        arr[0] = "Aayush";
        System.out.println("Inside changeName method, name = " + arr[0]);
    }

    public static void main(String[] args) {
        // Call by value example
        int a = 5;
        increment(a);
        System.out.println("Outside increment method, a = " + a);

        // Call by reference example
        String[] names = { "Aayush" };
        changeName(names);
        System.out.println("Outside changeName method, name = " + names[0]);
    }
}
