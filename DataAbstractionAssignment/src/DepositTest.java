import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DepositTest {
    Deposit testDeposit;

    @Before
    public void setup(){
        testDeposit = new Deposit(100.00, new Date(), Customer.CHECKING);
    }

    @Test

    public void testDepositToString(){
        //Test if the account is CHECKING, return the amount is added to STRING ACCOUNT
       assertTrue(testDeposit.equals(Customer.CHECKING));
       assertTrue("Deposit"+)
    }


}
