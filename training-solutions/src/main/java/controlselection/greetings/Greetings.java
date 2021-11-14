package controlselection.greetings;

public class Greetings {

    public static final int MINUTES = 60;

    public String greet(int hour, int minutes) {
        int timeInMinutes = hour * MINUTES + minutes;
        if (timeInMinutes > 5 * MINUTES && timeInMinutes <= 9 * MINUTES) {
            return "jó reggelt";
        } else if (timeInMinutes > 9 * MINUTES && timeInMinutes <= 18 * MINUTES + 30) {
            return "jó napot";
        } else if (timeInMinutes > 18 * MINUTES + 30 && timeInMinutes <= 20 * MINUTES) {
            return "jó estét";
        } else {
            return "jó éjt";
        }
    }
}
