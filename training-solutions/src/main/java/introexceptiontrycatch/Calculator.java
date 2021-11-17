package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

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
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case "*":
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case "/":
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Nem a megadott műveletek közül választott, ezért a műveletet nem lehet elvégezni!");
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println("A 0-val való osztás nem értelmezhető művelet!");
        }
    }
}
