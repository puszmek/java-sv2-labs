package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public double getYield(int days) {
        return fund*((double)interestRate/100)*((double)days/365);
    }

    public double close(int days) {
        double payout = active ? (getFund() + getYield(days))*(1-(cost/100)) : 0;
        active = false;
        return payout;
    }

    public double getFund() {
        return fund;
    }
}
