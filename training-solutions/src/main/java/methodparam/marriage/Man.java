package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Man {

    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name) {
        if (name == null || !name.trim().contains(" ")) {
            throw new IllegalArgumentException("Name is invalid!");
        }
        this.name = name;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return this.registerDates;
    }
}
