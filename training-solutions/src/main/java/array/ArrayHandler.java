package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();

        int[] numbers = new int[] {0, 10, 20, 30, 40, 50};

        String[] words = {"cat", "dog", "horse", "cow"};

        arrayHandler.addIndexToNumber(numbers);
        for (int item: numbers) {
            System.out.println(item);
        }
        for (int item: numbers) {
            System.out.print(item + ", ");
        }

        System.out.println();

        arrayHandler.concatenateIndexToWord(words);
        for (String item: words) {
            System.out.println(item);
        }
        for (String item: words) {
            System.out.print(item + ", ");
        }
    }
}
