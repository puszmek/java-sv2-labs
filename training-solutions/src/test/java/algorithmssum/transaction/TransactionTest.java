package algorithmssum.transaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    Transaction transaction;

    @BeforeEach
    void init() {
        transaction = new Transaction("1000-2345-6007", TransactionOperation.CREDIT, 800_000);
    }

    @Test
    void testCreateTransaction() {
        assertEquals("1000-2345-6007", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals(800_000, transaction.getAmount());
    }

    @Test
    void testIsCredit() {
        assertTrue(transaction.isCredit());
    }

    @Test
    void testIsDebit() {
        assertFalse(transaction.isDebit());
    }
}