package typeconversion;

public class Conversion {

    public double convertToDouble(double number) {
        return (double) ((int) number);
    }

    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] bytes = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] < 127) {
                bytes[i] = (byte) numbers[i];
            } else {
                bytes[i] = -1;
            }
        }
        return bytes;
    }

    public double getFirstDecimal(double number) {
        return (int)((number - (int) number) * 10);
    }
}