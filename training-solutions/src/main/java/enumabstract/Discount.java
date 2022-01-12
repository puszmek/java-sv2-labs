package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return pieces * price * 80/100;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces <= 2) {
                return pieces * price * 75/100;
            } else {
                return price * 50/100 + (pieces - 1) * price * 75/100;
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
