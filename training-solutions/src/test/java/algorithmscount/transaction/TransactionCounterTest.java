package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testCountEntryLessThan() {
        TransactionCounter counter = new TransactionCounter();
        List<Transaction> transactions = Arrays.asList(
                new Transaction("112233", TransactionType.CREDIT, 1000),
                new Transaction("223344", TransactionType.CREDIT, 2500),
                new Transaction("334455", TransactionType.CREDIT, 4000),
                new Transaction("445566", TransactionType.DEBIT, 3000));
        assertEquals(3, counter.countEntryLessThan(transactions, 5000));
        assertEquals(2, counter.countEntryLessThan(transactions, 4000));
        assertEquals(0, counter.countEntryLessThan(transactions, 1000));
    }
}