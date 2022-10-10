package main;

public class DiceGame extends Game {

    private int die;
    private int player;

    public void initializeGame() {
        System.out.println("Noppapeli alkaa. Kutosella voittaa! (Ei tasoittavaa vuoroa, koska peli ei ole reilu.)");
    }
   
    public void makePlay(int player) {
        this.player = player;
        die = (int)(Math.random()*6) + 1;
        System.out.println("Pelaaja " + player + " heitti nopasta " + die);
    } 

    public boolean endOfGame() {
        if (die == 6) {
            return true;
        }
        return false;
    }
       
    public void printWinner() {
        System.out.println("Peli loppui! Voittaja: pelaaja " +  player);
    }
       
}
