package bankingApplication;

import Tdd.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void accountCanBeDepositedIntoTest() {
        Account myAccount = new Account();

        //when
        myAccount.depositMoney(2500.00);

        //given
        double balance = myAccount.getAccountBalance();
        assertEquals(2500.00, balance);


    }

    @Test
    @DisplayName("money can be deposited twice test")
    void accountCanReceiveDoubleDepositTest() {
        Account JohnAccount = new Account();
        JohnAccount.depositMoney(2500.00);

        JohnAccount.depositMoney(3500.00);
        assertEquals(6000.00, JohnAccount.getAccountBalance());


    }

    @Test
    public void accountCannotReceiveNegativeDepositTest() {
        Account humbleAccount = new Account();
        humbleAccount.depositMoney(-7687677);
        assertEquals(0, humbleAccount.getAccountBalance());
    }

    @Test
    public void moneyCanBaWithdrawnFromAccountWithValidPin() {
        Account peterAccount = new Account();
        peterAccount.depositMoney(7000.00);
        peterAccount.setPin(1234);
    }


    @Test
    void calculatorCanCalculate() {
        LocalDate bessieDob = LocalDate.of(2018, 5, 8);
        System.out.println("Bessie's ");

        //@Test
        //public void moneyCannotBeWithdrawnWithoutValidPin() {
        //  Account peterAccount = new Account();
        //peterAccount.withdrawMoney(2000, 1234);
        //assertEquals(peterAccount.getAccountBalance(), 7000);



    }
}




