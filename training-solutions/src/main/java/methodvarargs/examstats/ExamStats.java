package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if ( results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int numberOfTop = 0;
        for (int actual : results) {
            if (actual >= maxPoints * limitInPercent / 100d) {
                numberOfTop++;
            }
        }
        return numberOfTop;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (int actual : results) {
            if (actual < maxPoints * limitInPercent / 100d) {
                return true;
            }
        }
        return false;
    }
}
