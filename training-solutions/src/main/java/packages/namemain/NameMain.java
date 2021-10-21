package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {

        Prefix prefix = new Prefix("Dr.");
        FirstName firstName = new FirstName("John");
        LastName lastName = new LastName("Doe");

        String pre = prefix.getPre();
        String first = firstName.getFirst();
        String last = lastName.getLast();

        System.out.println(pre + " " + first + " " + last);
    }
}
