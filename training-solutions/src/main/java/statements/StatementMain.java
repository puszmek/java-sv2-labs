package statements;

public class StatementMain {

    public static void main(String[] args) {

        int x = 5 + 6;
        System.out.println("x = 5 + 6 = " + x);

        int y = 11 - x;
        System.out.println("y = 11 - x = " + y);

        int z = 8;
        System.out.println("z = " + z);

        boolean b = x > y;
        System.out.println("b = x > y = " + b);

        boolean c = (b = true) || (z > 5);
        System.out.println("c = (b = true) || (z > 5) = "+ c);

        z++;
        System.out.println("z + 1 = " + z);

    }
}