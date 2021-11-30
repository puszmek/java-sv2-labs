package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {
        char[] charsOfMap = map.toCharArray();
        int lengthOfOcean = 0;
        int maxLength = 0;
        for (char actual : charsOfMap) {
            if (actual == '0') {
                lengthOfOcean++;
            }
            if (actual == '1' && lengthOfOcean > maxLength) {
                maxLength = lengthOfOcean;
            }
            if (actual == '1') {
                lengthOfOcean = 0;
            }
        }
        return maxLength;
    }
}
