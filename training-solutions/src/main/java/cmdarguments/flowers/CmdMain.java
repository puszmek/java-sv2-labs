package cmdarguments.flowers;

public class CmdMain {

    public static void main(String[] args) {

        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            int ordinalNumber = i + 1;
            System.out.println(ordinalNumber + ". elem: " + args[i]);
        }
    }
}
