import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        accountNumber = 0;
        checkBalance = 0;
        savingBalance = 0;
        savingRate = 0;
        name = " ";
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        accountNumber++;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double deposit(double amt, Date date, String account){
        //your code here
        if (account.equals(CHECKING)){
            checkBalance+=amt;
            deposits.add(new Deposit(amt,date,account));
        }
        if (account.equals(SAVING)){
            savingBalance+=amt;
            deposits.add(new Deposit(amt,date,account));
        }
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        if (account.equals(CHECKING)){
            if (checkBalance - amt >=OVERDRAFT){
                checkBalance-=amt;
                withdraws.add(new Withdraw(amt,date,account));
            }
            else {
                System.out.println("Balance not enough");
            }
        }
        if (account.equals(SAVING)){
            if (savingBalance-amt>=OVERDRAFT){
                savingBalance-=amt;
                withdraws.add(new Withdraw(amt,date,account));
            }
            else {
                System.out.println("Balance not enough");
            }
        }
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if(account.equals(CHECKING)){
            if (checkBalance-amt>=OVERDRAFT){
                return true;
            }
        }
        if (account.equals(SAVING)){
            if (savingBalance-amt>=OVERDRAFT){
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
