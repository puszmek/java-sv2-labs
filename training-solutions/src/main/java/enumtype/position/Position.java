package enumtype.position;

public enum Position {

    DIRECTOR(1_600_000, "bonus, car, phone"), MANAGER(1_200_000, "bonus, car, phone"), COORDINATOR(980_000, "bonus, phone"), TEAM_LEADER(700_000, "bonus, phone");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
