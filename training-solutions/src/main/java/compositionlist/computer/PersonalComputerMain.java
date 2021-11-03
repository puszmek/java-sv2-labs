package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        Cpu cpu = new Cpu("Core i7", 8700);
        System.out.println(cpu);

        PersonalComputer personalComputer = new PersonalComputer(cpu);

        Hardware mouse = new Hardware("egér", "ASUS Rog Spatha");
        Hardware keyBoard = new Hardware("billentyűzet", "Steelseries Apex Pro");
        Software windows = new Software("Windows", 11);
        personalComputer.addHardware(mouse);
        personalComputer.addHardware(keyBoard);
        personalComputer.addSoftware(windows);
        System.out.println(mouse);
        System.out.println(keyBoard);
        System.out.println(windows);
        System.out.println();

        System.out.println(personalComputer.getCpu());
        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftwares());
        System.out.println();

        System.out.println(personalComputer);



    }
}
