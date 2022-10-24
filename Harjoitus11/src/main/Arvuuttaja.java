package main;

public class Arvuuttaja {
    
    public Memento liityPeliin() {
        return new Memento((int)(Math.random()*10) + 1);
    }

    public boolean guess(String guesser, Object obj, int number) {
        Memento memento = Memento.class.cast(obj);
        System.out.println(guesser + " veikkasi " + number);
        if (memento.getNumber() == number) {
            System.out.println(guesser + " arvasi oikein!");
            return true;
        }
        return false;
    }

    private class Memento {

        private int number;

        public Memento(int number) {
            this.number = number;
        }

        public int getNumber() {
            return this.number;
        }

    }

}
