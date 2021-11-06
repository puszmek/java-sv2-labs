package operators;

public class Operators {

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public String getResultOfDivision(int number, int divisor) {
        int result = number / divisor;
        int remainder = number % divisor;
        return number + " / " + divisor  + " = " + result + " maradék: " + remainder;
    }

    public String isNull(String s) {
        return s == null ? "null értékű" : "nem null értékű";
    }

    public boolean isEmpty(String s) {
        return s == null || s.equals("");
    }
}
