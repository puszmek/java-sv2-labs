package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("A számológép használatához adjon meg két egész számot!");

        System.out.println("Adja meg az első számot!");
        int firstNumber = 0;
        try {
            firstNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem számot adott meg, ezért az első szám alapértelmezett értéke 0 lesz.");
        }

        System.out.println("Adja meg a második számot!");
        int secondNumber = 0;
        try {
            secondNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem számot adott meg, ezért a második szám alapértelmezett értéke 0 lesz.");
        }

        System.out.println("Adja meg a számokkal elvégzendő műveletet: +, -, *, / !");
        String operation = scanner.nextLine();
        try {
            switch (operation) {
                case "+":
                    System.out.println("A megadott számok összege: " + calculator.additionOfNumbers(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println("A megadott számok különbsége: " + calculator.subtractionOfNumbers(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println("A megadott számok szorzata: " + calculator.multiplicationOfNumbers(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println("A megadott számok hányadosa: " + calculator.divisionOfNumbers(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Nem a megadott műveletek közül választott, ezért a műveletet nem lehet elvégezni!");
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println("A 0-val való osztás nem értelmezhető művelet!");
        }
    }
}
