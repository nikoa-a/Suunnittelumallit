package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        MyThread newThread = new MyThread();
        newThread.start();

        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {
        }

        newThread.end();
    }

}
