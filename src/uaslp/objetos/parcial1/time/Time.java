package uaslp.objetos.parcial1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int delta) {
        hour += delta;
        if(hour > 23) {
            hour = 0;
        }
        else {
            if(hour < 0) {
                hour = 0;
            }
        }
    }

    public void addMinute(int delta) {
        minute += delta;
        if(minute > 59) {
            addHour(1);
            minute=0;
        }
        else {
            if(minute < 0) {
                minute = 0;
            }
        }
    }

    public void addSecond(int delta) {
        second += delta;
        if(second > 59) {
            addMinute(1);
            second=0;
        }
        else {
            if(second < 0) {
                second = 0;
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
