package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Time time = new Time(10, 45, 36);
        Clock clock = new Clock(time);

        clock.move();
        System.out.println("Kello 1: " + clock);

        Clock clock2 = clock.clone();
        System.out.println("Kello 2: " + clock2);

        clock2.move();

        System.out.println("Kello 1: " + clock);
        System.out.println("Kello 2: " + clock2);

    }
    
}
