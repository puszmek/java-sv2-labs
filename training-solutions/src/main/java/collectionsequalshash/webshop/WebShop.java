package collectionsequalshash.webshop;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public int findHowMany(Product product) {
        int count = 0;
        for (Product actual : products) {
            if (actual.equals(product)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        WebShop webShop = new WebShop();
        webShop.getProducts().add(new Product("table", "0001"));
        webShop.getProducts().add(new Product("chair", "0002"));
        webShop.getProducts().add(new Product("armchair", "0002"));
        webShop.getProducts().add(new Product("couch", "0002"));
        System.out.println(webShop.findHowMany(new Product("desk", "0001")));
        System.out.println(webShop.findHowMany(new Product("sofa", "0002")));
        System.out.println(webShop.findHowMany(new Product("table", "0003")));
    }
}
