package main;

public class CarTopSpeedInKPH extends CarTopSpeedInMPH implements CarSpeed {

    public double getSpeed() {
        int scale = (int) Math.pow(10, 1);
        double speed = super.getSpeed() * 1.60934;
        return (double) Math.round(speed * scale) / scale;
    }
    
}
