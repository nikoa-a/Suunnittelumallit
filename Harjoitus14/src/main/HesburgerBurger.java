package main;

public class HesburgerBurger {

    private Bun bun;
    private Beef beef;
    private Sauce sauce;

    public void setBun(Bun bun) { 
        this.bun = bun; 
    }

    public void setBeef(Beef beef) { 
        this.beef = beef; 
    }

    public void setSauce(Sauce sauce) { 
        this.sauce = sauce; 
    }

    public String toString() {
        return "Hesburger Burger: sämpylä: " + bun.getBun() + ", pihvi: " + beef.getBeef() + ", kastike: " + sauce.getSauce();
    }
    
}
