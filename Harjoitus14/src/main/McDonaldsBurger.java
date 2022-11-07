package main;

public class McDonaldsBurger {

    private String bun = "";
    private String beef = "";
    private String sauce = "";

    public void setBun(String bun) { 
        this.bun = bun; 
    }

    public void setBeef(String beef) { 
        this.beef = beef; 
    }

    public void setSauce(String sauce) { 
        this.sauce = sauce; 
    }

    public String toString() {
        return "McDonalds Burger: sämpylä: " + this.bun + ", pihvi: " + this.beef + ", kastike: " + this.sauce;
    }
    
}
