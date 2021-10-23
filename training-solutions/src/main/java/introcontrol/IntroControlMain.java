package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(0));
        System.out.println(introControl.subtractTenIfGreaterThanTen(5));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(45) + "\n");

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(20) + "\n");

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Bob") + "\n");

        System.out.println(introControl.calculateBonus(7654321));
        System.out.println(introControl.calculateBonus(4321) + "\n");

        System.out.println(introControl.calculateConsumption(840, 1080));
        System.out.println(introControl.calculateConsumption(8840, 80) + "\n");

        introControl.printNumbers(8);
        System.out.println();

        introControl.printNumbersBetween(54, 60);
        System.out.println();

        introControl.printNumbersBetweenAnyDirection(7, 14);
        introControl.printNumbersBetweenAnyDirection(17, 11);
        System.out.println();

        introControl.printOddNumbers(9);
        introControl.printOddNumbers(10);
    }
}
