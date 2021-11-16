package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {

    public static void main(String[] args) {

        List<String> codeMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        for (String code: codeMessage) {
            char message = (char) Integer.parseInt(code);
            System.out.print(message);
        }
        System.out.println();
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
        for (String anothercode: anotherCodedMessage) {
            char anothermessage = (char) Integer.parseInt(anothercode);
            System.out.print(anothermessage);
        }
        // A második 101-es számnál keletkezik a kivétel, mert O betű van a 0 helyett, az O betűt pedig nem lehet számmá alakítani.
    }
}
