package enumtype.position;

import java.util.Arrays;

public class PositionMain {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Position.values()));

        System.out.println(Position.DIRECTOR +
                " salary: " + Position.DIRECTOR.getSalary() +
                " Ft benefits: " + Position.DIRECTOR.getBenefit());

        System.out.println(Position.MANAGER +
                " salary: " + Position.MANAGER.getSalary() +
                " Ft benefits: " + Position.MANAGER.getBenefit());

        System.out.println(Position.COORDINATOR +
                " salary: " + Position.COORDINATOR.getSalary() +
                " Ft benefits: " + Position.COORDINATOR.getBenefit());

        System.out.println(Position.TEAM_LEADER +
                " salary: " + Position.TEAM_LEADER.getSalary() +
                " Ft benefits: " + Position.TEAM_LEADER.getBenefit());
    }
}
