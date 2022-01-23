package collectionsequalshash.webshop;

import java.util.Objects;

public class Product {

    private String nameOfProduct;
    private String registrationNumber;

    public Product(String nameOfProduct, String registrationNumber) {
        this.nameOfProduct = nameOfProduct;
        this.registrationNumber = registrationNumber;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(registrationNumber, product.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }
}
