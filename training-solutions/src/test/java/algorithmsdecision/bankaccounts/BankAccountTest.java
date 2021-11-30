package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Kiss Péter", "11-22-33", 100_000);

    @Test
    void testCreateBankAccount() {
        assertEquals("Kiss Péter", bankAccount.getNameOfOwner());
        assertEquals("11-22-33", bankAccount.getAccountNumber());
        assertEquals(100_000, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.withdraw(60_000);
        assertEquals(40_000, bankAccount.getBalance());
        assertTrue(bankAccount.withdraw(1_000));
        assertFalse(bankAccount.withdraw(1_000_000));
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(30_000);
        assertEquals(130_000, bankAccount.getBalance());
        assertTrue(bankAccount.deposit(1_000_000));
    }
}