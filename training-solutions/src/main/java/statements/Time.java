package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        return hours*60 + minutes;
    }

    public int getInSeconds() {
        return getInMinutes()*60 + seconds;
    }

    public boolean earlierThan(Time secondTime) {
        int timeInSeconds = this.getInSeconds();
        int time2InSeconds = secondTime.getInSeconds();
        return timeInSeconds < time2InSeconds;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

}