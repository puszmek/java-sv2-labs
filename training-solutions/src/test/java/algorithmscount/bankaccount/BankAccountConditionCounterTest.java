package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void testCountWithBalanceGreaterThan() {
        BankAccountConditionCounter counter = new BankAccountConditionCounter();
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Kiss Péter", "112245", 10_000_000),
                new BankAccount("Kovács Zoltán", "223345", 9_000_000),
                new BankAccount("Nagy Jakab", "334445", 15_000_000));
        assertEquals(3, counter.countWithBalanceGreaterThan(bankAccounts, 5_000_000));
        assertEquals(1, counter.countWithBalanceGreaterThan(bankAccounts, 10_000_000));
        assertEquals(0, counter.countWithBalanceGreaterThan(bankAccounts, 25_000_000));
    }
}