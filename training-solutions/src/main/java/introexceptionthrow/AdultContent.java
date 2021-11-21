package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {

        Adult adult = new Adult("Ferenc Péter", 28);
        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        Adult anotheradult = new Adult("Molnár Dénes", 18);
        System.out.println(anotheradult.getName());
        System.out.println(anotheradult.getAge());

        Adult person = new Adult("Varga Géza", 17);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
