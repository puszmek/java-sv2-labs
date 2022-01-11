package interfacedependencyinversion.amount;

public class Cash implements  Payable {

    @Override
    public int getPayableAmount(int amount) {
        int number = amount % 5;
        if (number <= 2) {
             return amount -= number;
        } else {
            return amount += (5 - number);
        }
    }
}
