public class accounts {
    private int acnumber;
    private String name;
    private String acname;
    private double balance;

    public accounts(int acnumber, String name, String acname, double balance) {
        this.acnumber = acnumber;
        this.name = name;
        this.acname = acname;
        this.balance = balance;
    }

    public void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Aayush Upadhyay");
            System.out.println("09929802021");
            System.out.println("Withdrawl Successful . New Balance: " + balance);
        } else {
            System.out.println("Insufficent funds. Withdrawl unsuccesful.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    public void display() {
        System.out.println("Account number: " + acnumber);
        System.out.println("Name" + name);
        System.out.println("Account Name: " + acname);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        accounts account = new accounts(123, "Tassu", "Savings", 5000.00);

        account.withdrawl(2000.00);
        account.deposit(5000.00);
        account.display();
    }

}
