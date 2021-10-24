package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] daysOfWeek = {"Monday" ,"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfWeek[1]);
        System.out.println(daysOfWeek.length);

        int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
//            powersOfTwo[i] = (int)Math.pow(2, i);
        }
        for (int i = 0; i < powersOfTwo.length; i++) {
            System.out.print(powersOfTwo[i] + " ");
        }

        System.out.println();

        boolean[] arrayTrueAndFalse= new boolean[6];
        for ( int i = 1 ; i < arrayTrueAndFalse.length; i++) {
            arrayTrueAndFalse[i] = !(arrayTrueAndFalse[i-1]);
        }
//        for (int i = 1; i < arrayTrueAndFalse.length; i = i + 2) {
//            arrayTrueAndFalse[i] = true;
//        }
        for (int i = 0; i < arrayTrueAndFalse.length; i++) {
            System.out.print(arrayTrueAndFalse[i] + " ");
        }
    }
}
