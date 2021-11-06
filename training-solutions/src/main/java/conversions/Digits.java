package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void addDigitsToList(String text) {
        char[] chars = text.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c)) {
                list.add(Integer.parseInt(Character.toString(c)));
            }
        }
    }

    public static void main(String[] args) {

        Digits digits = new Digits();
        digits.addDigitsToList("a5d6f8 f8d4e5-f64");
        System.out.println(digits.getList());
    }
}
