public class countobj {
    static int count;

    public countobj() {
        count++;
    }

    public static void main(String args[]) {

        countobj ob1 = new countobj();
        countobj ob2 = new countobj();
        countobj ob3 = new countobj();
        countobj ob4 = new countobj();
        countobj ob5 = new countobj();
        countobj ob6 = new countobj();

        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");

        System.out.print("Total Number of Objects: " + countobj.count);
    }

}
