package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store carStore = new Store("car");
        carStore.store(88);
        System.out.println("Stock of " + carStore.getProduct() + " after replenishment: " + carStore.getStock());

        carStore.dispatch(55);
        System.out.println("Stock of " + carStore.getProduct() + " after dispatch: " + carStore.getStock());

    }
}
