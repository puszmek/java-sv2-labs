package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {

    private List<Double> kms;
    private String name;

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double km){
        kms.add(km);
    }

    public String printFormattedRunText(){
        String date = LocalDate.now().toString();
        if(kms.isEmpty()) {
            return String.format("Kedves %s! A mai dátum: %s. Ezen a héten még nem futottál. Igyekezz jobban!", name, date);
        } else {
            return String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.2f km-t futottál. Csak így tovább!", name, date, kms.size(), kms.get(kms.size() - 1));
        }
    }

    public static void main(String[] args) {
        Run run = new Run("John Doe");
        System.out.println(run.printFormattedRunText());
        run.addRun(4.2);
        System.out.println(run.printFormattedRunText());
        run.addRun(5.15);
        System.out.println(run.printFormattedRunText());
        run.addRun(6.32);
        System.out.println(run.printFormattedRunText());
        run.addRun(6.45);
        System.out.println(run.printFormattedRunText());
        run.addRun(8);
        System.out.println(run.printFormattedRunText());
    }
}
