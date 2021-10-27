package finalmodifier;

public class TaxCalculator {

    public static final double PERCENT = 27;

    public double tax(double price) {
        return price * PERCENT / 100;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(100));
        System.out.println(taxCalculator.priceWithTax(100));
    }
}
