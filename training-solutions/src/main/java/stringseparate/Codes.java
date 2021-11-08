package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder stringBuilder = new StringBuilder("Betűvel kezdődő kódok: ");
        boolean first = true;
        for (String code : codes) {
            if (Character.isAlphabetic(code.charAt(0))) {
                if (first) {
                    first = false;
                } else {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(code);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        Codes codes = new Codes();
        List<String> codeList = Arrays.asList("T57fbj", "123hj5", "xtcu45", "f578GVHd", "478fds");
        System.out.println(codes.getCodesStartWithLetter(codeList));
    }
}