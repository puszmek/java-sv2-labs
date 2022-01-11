package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayableTest {

    @Test
    void testAmount() {
        Payable payable = new Amount();
        assertEquals(547, payable.getPayableAmount(547));
    }

    @Test
    void testCash() {
        Payable payable = new Cash();
        assertEquals(100, payable.getPayableAmount(101));
        assertEquals(105, payable.getPayableAmount(103));
        assertEquals(105, payable.getPayableAmount(106));
        assertEquals(110, payable.getPayableAmount(109));
        assertEquals(110, payable.getPayableAmount(110));
    }

    @Test
    void testBankAtm() {
        Payable payable = new BankAtm();
        assertEquals(4000, payable.getPayableAmount(3147));
    }
}
