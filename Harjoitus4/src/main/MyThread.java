package main;

public class MyThread extends Thread {

    private boolean end = false;
    ClockTimer timer = new ClockTimer();
    DigitalClock digitalClock = new DigitalClock(timer);

    public void run() {

        while (!end) {
            timer.tick();
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
            }
        }
    }

    public void end() {
        end = true;
    }
    
}
