package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int x = i / 10;
            int y = i % 10;
            if (Math.abs(x - y) == 5) {
                count++;
            }
        }
        return count;
    }
}
