/**
 * Created by eugenevendensky on 1/17/17.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BankTest {
    Bank bank;
    @Before
    public void setUp() {
        bank= new Bank();
    }


    @Test
    public void getAccountBalance (){
        int expected = 0;
        double actual = bank.getAccountBalance();
        assertEquals(expected, actual, 0 );
    }



    @Test
    public void debitAccount (){
        bank.debitAccount(100);
        int expected = -100;
        int actual = bank.getAccountBalance();
        assertEquals(expected, actual, 0 );
    }
    @Test
    public void creditAccount (){
        bank.creditAccount(100);
        int expected = 100;
        int actual = bank.getAccountBalance();
        assertEquals(expected, actual, 0 );

    }
    @Test
    public void getTransactions (){
        int expected = 0;
        int actual = bank.getTransactions();
        assertEquals(expected, actual, 0 );}

}
