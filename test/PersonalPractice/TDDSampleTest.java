package PersonalPractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDSampleTest {
    TDDSample user;

    @BeforeEach
    void beforeEach() {
        user = new TDDSample();
    }

    @AfterEach
    void afterEach() {
        user = null;
    }

    @Test
    void userAccountBalanceIsZero() {
        assertEquals(user.getBalance(), 0);
    }

    @Test
    void userAccountCanBeDepositedTo() {
        user.deposit(1000);
        assertEquals(user.getBalance(), 1000);
    }

    @Test
    void userCanDepositMultipleTimes() {
        user.deposit(1000);
        user.deposit(5000);
        user.deposit(2000);
        assertEquals(user.getBalance(), 8000);
    }

    @Test
    void userCannotDepositNegativeAmount() {

        user.deposit(1000);
        user.deposit(-5000);
        assertEquals(user.getBalance(), 1000);
    }

    @Test
    void userCannotDepositZero() {

        user.deposit(1000);
        user.deposit(0);
        assertEquals(user.getBalance(), 1000);
    }

    @Test
    void userCanWithdrawFromAccount() {

        user.deposit(10000);
        user.withdraw(2000);
        assertEquals(user.getBalance(), 8000);
    }

    @Test
    void userCannotWithdrawMoreThanBalance() {

        user.withdraw(1000);
        assertEquals(0, user.getBalance());
    }

    @Test
    void userCannotWithdrawNegativeAmount() {

        user.withdraw(-1000);
        assertEquals(user.getBalance(), 0);
    }
}