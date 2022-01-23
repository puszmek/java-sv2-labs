package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        Company firstCompany = new Company("Stark", "123 456");
        Company secondCompany = new Company("Milka", "456 798");
        Company thirdCompany = new Company("Bambi", "789 123");
        companies.add(firstCompany);
        companies.add(secondCompany);
        companies.add(thirdCompany);
        System.out.println(companies.contains(new Company("Stark", "123 456")));
        System.out.println(companies.contains(new Company("Bambi", "111 111")));
    }
}
