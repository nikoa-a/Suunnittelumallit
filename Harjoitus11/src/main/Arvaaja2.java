package main;

public class Arvaaja2 extends Thread {

    private Object obj;
    private boolean end = false;
    Arvuuttaja arvuuttaja = new Arvuuttaja();

    public Arvaaja2(Arvuuttaja arvuuttaja) {
        this.obj = arvuuttaja.liityPeliin();
    }

    @Override
    public void run() {
        boolean check;
        while (!end) {
            check = arvuuttaja.guess("Arvaaja 2", this.obj, (int)(Math.random()*10) + 1);
            if (check == true) {
                end();
            }
        }
    }

    public void end() {
        end = true;
    }
    
}
