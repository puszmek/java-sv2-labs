package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber) {
        angleNumber += angle;
        if (angleNumber < -80 || angleNumber > 80) {
            throw new IllegalArgumentException("A tank lövegcsöve jobbra és balra is csak 80°-ot tud fordulni! A megadott értéknek -80 és 80 közötti számnak kell lennie!");
        }
        angle = angleNumber;
    }

    public int getAngle() {
        return angle;
    }
}
