package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();
    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> upload) {
        ACTUAL_RATES.addAll(upload);
        this.balance = Math.round(balance * getConversionRate(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public boolean payment(long amount, Currency currency) {
        long amountInHuf = Math.round(amount * getConversionRate(currency));
        if (amountInHuf <= balance) {
            balance -= amountInHuf;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }

    public long getBalance() {
        return balance;
    }

    private double getConversionRate(Currency currency) {
        for (Rate actual : ACTUAL_RATES) {
            if (actual.getCurrency() == currency) {
                return actual.getConversionFactor();
            }
        }
        if (currency == Currency.HUF) {
            return 1.0;
        } else {
            throw new IllegalStateException("Rates are not uploaded.");
        }
    }
}
