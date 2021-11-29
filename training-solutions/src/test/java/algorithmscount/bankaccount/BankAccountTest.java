package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void createBankAccount() {
        BankAccount bankAccount = new BankAccount("Kiss Péter", "101145", 10_000);
        assertEquals("Kiss Péter", bankAccount.getNameOfOwner());
        assertEquals("101145", bankAccount.getAccountNumber());
        assertEquals(10_000, bankAccount.getBalance());
    }
}