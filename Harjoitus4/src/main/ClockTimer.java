package main;

import java.util.Observable;

//OBSERVABLE
public class ClockTimer extends Observable {

    private static int hour = 0;
    private static int minute = 0;
    private static int second = 0;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {

        second = second + 1;

        if (second == 60) {
            minute += 1;
            second = 0;
          }
          if (minute == 60) {
            hour += 1;
            minute = 0;
          }
          if (hour == 24) {
            hour = 0;
            minute = 0;
            second = 0;
          }
          setChanged();
          notifyObservers();
    }
    
}
