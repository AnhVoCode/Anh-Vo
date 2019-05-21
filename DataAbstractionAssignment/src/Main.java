import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer a = new Customer();
        Customer b = new Customer("A",1,100.00, 200.00);
        //Deposit
        b.deposit(50.00, new Date(), Customer.CHECKING);
        b.deposit(30.00, new Date(),Customer.SAVING);
        System.out.println(b.getCheckBalance());
        System.out.println(b.getSavingBalance());
        Deposit one = new Deposit(50.00, new Date(),Customer.CHECKING);
        Deposit two = new Deposit(30.00, new Date(),Customer.SAVING);
        System.out.println(one.toString());
        System.out.println(two.toString());


        //Withdraw
        b.withdraw(60.00, new Date(),Customer.CHECKING);
        System.out.println(b.getCheckBalance());
        Withdraw x = new Withdraw(60.00, new Date(),Customer.CHECKING);
        System.out.println(x.toString());

    }
}
