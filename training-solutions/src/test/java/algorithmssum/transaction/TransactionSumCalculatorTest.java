package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void testSumAmountOfCreditEntries() {
        TransactionSumCalculator calculator = new TransactionSumCalculator();
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1111-2222-3333", TransactionOperation.CREDIT, 800_000),
                new Transaction("2222-3333-4444", TransactionOperation.DEBIT, 600_000),
                new Transaction("3333-4444-5555", TransactionOperation.CREDIT, 0),
                new Transaction("4444-5555-6666", TransactionOperation.CREDIT, -10_000),
                new Transaction("5555-6666-7777", TransactionOperation.DEBIT, -200));
        assertEquals(790_000, calculator.sumAmountOfCreditEntries(transactions));
    }
}