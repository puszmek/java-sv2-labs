package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void testContainsBalanceGreaterThan() {
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Kiss Péter", "11-22-33", 1_000_000),
                new BankAccount("Nagy Imre", "22-33-44", 2_000_000));
        assertTrue(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts, 900_000));
        assertFalse(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts, 2_000_000));
        assertFalse(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts, 2_500_000));
    }
}