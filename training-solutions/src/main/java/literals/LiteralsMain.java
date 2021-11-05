package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        System.out.println(Integer.toString(1) + Integer.toString(2));    // 12
        System.out.println(String.valueOf(1) + String.valueOf(2));      // 12
        System.out.println(1 + "" + 2);      // 12

        double quotient = 3 / 4;
        System.out.println(quotient);    // 0.0
        double quotient1 = 3d / 4;
        System.out.println(quotient1);     // 0.75

        long big = 3_244_444_444L;
        System.out.println(big);     // 3244444444

        String word = "title".toUpperCase();
        System.out.println(word);   // TITLE

        System.out.println(Integer.toBinaryString(1));     // 1
        System.out.println(Integer.toBinaryString(-2));    // 11111111111111111111111111111110
    }
}
