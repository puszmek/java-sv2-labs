package cmdarguments.verse;

public class VerseMain {

    public static void main(String[] args) {

        System.out.println(args.length);
        for (String i : args) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
