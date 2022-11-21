package main;

public class Time implements Cloneable {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void move() {

        this.seconds++;

        if (seconds == 60) {
            minutes += 1;
            seconds = 0;
          }

          if (minutes == 60) {
            hours += 1;
            minutes = 0;
          }
          
          if (hours == 24) {
            hours = 0;
            minutes = 0;
            seconds = 0;
          }

    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;

    }
        
    public String toString() {
        return hours + " : " + minutes + " : " + seconds;
    }
    
}
