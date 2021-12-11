package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {

        School school = new School("iskola", 20);
        School primary = new PrimarySchool("Petőfi Sándor Általános Iskola", 15);
        School secondary = new SecondarySchool("József Attila Gimnázium", 8);

        System.out.println(school);
        System.out.println(primary);
        System.out.println(secondary);

        /* name: iskola, numberOfYears: 20
        name: Petőfi Sándor Általános Iskola, numberOfYears: 15
        name: József Attila Gimnázium, numberOfYears: 8
        */
    }
}
