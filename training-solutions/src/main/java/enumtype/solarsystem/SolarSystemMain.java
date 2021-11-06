package enumtype.solarsystem;

public class SolarSystemMain {

    public static void main(String[] args) {

        System.out.println(SolarSystem.MERCURY);
        System.out.println(SolarSystem.MERCURY.getMoon());

        System.out.println(SolarSystem.VENUS);
        System.out.println(SolarSystem.VENUS.getMoon());

        System.out.println(SolarSystem.EARTH);
        System.out.println(SolarSystem.EARTH.getMoon());

        System.out.println(SolarSystem.MARS);
        System.out.println(SolarSystem.MARS.getMoon());

        System.out.println(SolarSystem.JUPITER);
        System.out.println(SolarSystem.JUPITER.getMoon());

        System.out.println(SolarSystem.SATURN);
        System.out.println(SolarSystem.SATURN.getMoon());

        System.out.println(SolarSystem.URANUS);
        System.out.println(SolarSystem.URANUS.getMoon());

        System.out.println(SolarSystem.NEPTUNE);
        System.out.println(SolarSystem.NEPTUNE.getMoon());
    }
}
