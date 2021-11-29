package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void createTransaction() {
        Transaction transaction = new Transaction("112233", TransactionType.DEBIT, 1000);
        assertEquals("112233", transaction.getAccountNumber());
        assertEquals(TransactionType.DEBIT, transaction.getTransactionType());
        assertEquals(1000, transaction.getAmount());
    }

    @Test
    void testIsCredit() {
        Transaction transaction = new Transaction("112233", TransactionType.DEBIT, 1000);
        assertFalse(transaction.isCredit());
    }

    @Test
    void testIsDebit() {
        Transaction transaction = new Transaction("112233", TransactionType.DEBIT, 1000);
        assertTrue(transaction.isDebit());
    }
}