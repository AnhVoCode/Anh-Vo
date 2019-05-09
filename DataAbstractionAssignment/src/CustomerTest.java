import org.junit.Before;
import org.junit.Test;

import java.util.Date;


import static org.junit.Assert.assertTrue;


public class CustomerTest{
    Customer testCustomer;

    @Before
    public void setup(){
       testCustomer = new Customer();
    }

    @Test
    public void testCustomerDeposit(){
        //Check the balance if deposit to CHECKING ACCOUNT
        testCustomer.deposit(100.00, new Date(),Customer.CHECKING);
        assertTrue(testCustomer.getCheckBalance()==100.00);
        //Check the balance if deposit to SAVING ACCOUNT
        testCustomer.deposit(100.00, new Date(), Customer.SAVING);
        assertTrue(testCustomer.getSavingBalance()==100.00);

    }

    @Test
    public void testCustomerWithdraw(){
        testCustomer.deposit(100.00, new Date(),Customer.CHECKING);
        testCustomer.deposit(100.00, new Date(), Customer.SAVING);

        //Check the balance if withdraw from CHECKING ACCOUNT
        testCustomer.withdraw(50.00, new Date(), Customer.CHECKING);
        assertTrue(testCustomer.getCheckBalance()==50.00);
        //Check OVERDRAFT
        testCustomer.withdraw(210, new Date(),Customer.CHECKING);
        assertTrue("Balance not enough",testCustomer.getCheckBalance()==50.00);

        //Check the balance if withdraw from SAVING ACCOUNT
        testCustomer.withdraw(50.00, new Date(), Customer.SAVING);
        assertTrue(testCustomer.getCheckBalance()==50.00);

        //Check OVERDRAFT
        testCustomer.withdraw(210, new Date(), Customer.SAVING);
        assertTrue("Balance not enough", testCustomer.getCheckBalance()==50.00);
    }



}
