package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    public int compareTo(Building o) {
        return Integer.valueOf(levels).compareTo(o.levels);
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" + "levels: " + levels + "}";
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Kerekes utca 4.", 289, 6));
        buildings.add(new Building("Rigó utca 23.", 245, 4));
        buildings.add(new Building("Rózsa utca 46.", 120, 2));
        System.out.println(buildings);
    }
}
