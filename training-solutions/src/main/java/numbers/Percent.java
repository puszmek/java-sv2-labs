package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int number1, int number2) {
        return (double)number1 * number2 / 100;
    }

    public double getBase(int number1, int number2) {
        return (double)number1 * 100 / number2;
    }

    public double getPercent(int number1, int number2) {
        return (double)number2 *100 / number1;
    }

    public static void main(String[] args) {

        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az első számot: ");
        int valueFirstNumber = scanner.nextInt();
        System.out.println("Adja meg a második számot: ");
        int valueSecondNumber = scanner.nextInt();
        System.out.println("Az első számnak a második szám szerinti százaléka: ");
        System.out.println(percent.getValue(valueFirstNumber, valueSecondNumber));

        System.out.println("Adja meg az első számot: ");
        int baseFirstNumber = scanner.nextInt();
        System.out.println("Adja meg a második számot: ");
        int baseSecondNumber = scanner.nextInt();
        System.out.println("Az első szám minek a második szám szerinti százaléka: ");
        System.out.println(percent.getBase(baseFirstNumber, baseSecondNumber));

        System.out.println("Adja meg az első számot: ");
        int percentFirstNumber = scanner.nextInt();
        System.out.println("Adja meg a második számot: ");
        int percentSecondNumber = scanner.nextInt();
        System.out.println("Az elsőnek hány százaléka a második: ");
        System.out.println(percent.getPercent(percentFirstNumber, percentSecondNumber));
    }
}
