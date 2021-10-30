package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("Nagy Dóra", 32);
        Person person2 = person1;
        person2.setName("Dobó Dávid");         // Ugyanarra az objektumra mutatnak, ezért mindkettő változott (a referencia másolása történt).
        System.out.println("person1: " + person1.getName() + " " + person1.getAge());
        System.out.println("person2: " + person2.getName() + " " + person2.getAge());

        int number1 = 24;
        int number2 = number1;
        number2 += 1;       // Csak a number2 változott, mert csak az értéket másoltuk át.
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);

        person1 = new Person("Kiss Péter", 28);  // A person1 változóban lecseréltük a referenciát, ezért a person1 és person2 két külön objektumra mutatnak, más-más érték van a változókban.
        System.out.println("person1: " + person1.getName() + " " + person1.getAge());
        System.out.println("person2: " + person2.getName() + " " + person2.getAge());
    }
}
