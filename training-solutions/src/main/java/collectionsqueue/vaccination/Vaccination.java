package collectionsqueue.vaccination;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person actual : people) {
            if (actual.getAge() >= 18 && actual.getAge() <= 65) {
                result.add(actual.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kovács Péter", 21));
        people.add(new Person("Kovács Péter", 65));
        people.add(new Person("Virág Hanna", 15));
        people.add(new Person("Deák Sándor", 72));
        people.add(new Person("Fehér Tamás", 20));
        people.add(new Person("Toldi Róbert", 38));
        people.add(new Person("Tóth Teréz", 68));
        Vaccination vaccination = new Vaccination();
        Queue<Integer> list = vaccination.getVaccinationOrder(people);
        System.out.println(list);
        System.out.println(list.poll());
    }
}
