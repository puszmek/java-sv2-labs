package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;
        if (angle < -80 || angle > 80) {
            throw new IllegalArgumentException("A tank lövegcsöve jobbra és balra is csak 80°-ot tud fordulni! A megadott értéknek -80 és 80 közötti számnak kell lennie!");
        }
    }

    public int getAngle() {
        return angle;
    }
}
