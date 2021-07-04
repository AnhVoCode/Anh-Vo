import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DepositTest {
    Deposit testDepositChecking;
    Deposit testDepositSaving;
    Withdraw testWithdrawChecking;
    Withdraw testWithdrawSaving;

    @Before
    public void setup(){
        testDepositChecking = new Deposit(100.0, new Date(), Customer.CHECKING);
        testDepositSaving = new Deposit(100.0, new Date(),Customer.SAVING);
        testWithdrawChecking = new Withdraw(50.0, new Date(),Customer.CHECKING);
        testWithdrawSaving = new Withdraw(50.0, new Date(), Customer.SAVING);
    }

    @Test

    public void testDepositToString(){
        //Test if the account is CHECKING
       assertEquals(testDepositChecking.toString(),"Deposit of:100.0 Date:"+new Date()+" into account:"+Customer.CHECKING);
       //Test if the account is SAVING
        assertEquals(testDepositSaving.toString(),"Deposit of:100.0 Date:"+new Date()+" into account:"+Customer.SAVING);
    }

    @Test
    public void testWithdrawtoString(){
        //Test if the account is Checking
        assertEquals(testWithdrawChecking.toString(),"Withdraw of: 50.0 Date: "+new Date()+" from account: "+Customer.CHECKING);
        //Test if the account is Saving
        assertEquals(testWithdrawSaving.toString(),"Withdraw of: 50.0 Date: "+new Date()+" from account: "+Customer.SAVING);

    }


}
