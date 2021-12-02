package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        price += (int)(price * (percent / 100.0));
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (getPricePerCapacity() > other.getPricePerCapacity()) {
            return 1;
        } else if (getPricePerCapacity() < other.getPricePerCapacity()) {
            return -1;
        } else {
            return 0;
        }
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
