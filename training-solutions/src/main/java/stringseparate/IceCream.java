package stringseparate;

public class IceCream {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Ma kapható: ");
        String[] iceCream = { "csoki", "vanília", "eper", "citrom", "puncs"};
        String text = "Gyerekeknek féláron!";
        for (int i = 0; i < iceCream.length; i++) {
            stringBuilder.append(iceCream[i]);
            stringBuilder.append((i == iceCream.length-1) ? ". " : ", ");
        }
        stringBuilder.append(text);
        System.out.println(stringBuilder);
    }
}
