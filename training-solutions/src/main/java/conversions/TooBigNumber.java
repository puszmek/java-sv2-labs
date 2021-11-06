package conversions;

import java.util.logging.SocketHandler;

public class TooBigNumber {

    public long getRightResult(int number) {
        return (long) 2_147_483_647 + number;
    }

    public static void main(String[] args) {

        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(43));
    }
}
