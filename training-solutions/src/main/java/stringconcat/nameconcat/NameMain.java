package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {

        Name firstName = new Name("Doe", "", "John", Title.MR);
        Name secondName = new Name("Boe", "John", "Jack", null);
        Name thirdName = new Name("Voe", null, "Jack", null);

        System.out.println(firstName.concatNameWesternStyle());
        System.out.println(firstName.concatNameHungarianStyle());
        System.out.println(secondName.concatNameWesternStyle());
        System.out.println(secondName.concatNameHungarianStyle());
        System.out.println(thirdName.concatNameWesternStyle());
        System.out.println(thirdName.concatNameHungarianStyle());
    }
}
