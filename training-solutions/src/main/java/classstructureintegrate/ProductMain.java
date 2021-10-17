package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        System.out.println("What is the product's name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What is the product's price?");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println("The price of " + product.getName() + ": " + product.getPrice());

        product.increasePrice(10);
        System.out.println("The new price of " + product.getName() + " after increase: " + product.getPrice());

        product.decreasePrice(10);
        System.out.println("The new price of " + product.getName() + " after decrease: " + product.getPrice());

    }

}
