package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson maxSalesAmount = null;
        for (Salesperson actual : sales) {
            if (maxSalesAmount == null || actual.getAmount() > maxSalesAmount.getAmount()) {
                maxSalesAmount = actual;
            }
        }
        return maxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson maxTarget = null;
        int maxDifference = Integer.MIN_VALUE;
        for (Salesperson actual : sales) {
            int actualDifference = actual.getDifferenceFromTarget();
            if (maxTarget == null || actualDifference > maxDifference) {
                maxDifference = actualDifference;
                maxTarget = actual;
            }
        }
        return maxTarget;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson minTarget = null;
        int minDifference = Integer.MAX_VALUE;
        for (Salesperson actual : sales) {
            int actualDifference = actual.getDifferenceFromTarget();
            if (minTarget == null || actualDifference < minDifference) {
                minTarget = actual;
                minDifference = actualDifference;
            }
        }
        return minTarget;
    }
}
