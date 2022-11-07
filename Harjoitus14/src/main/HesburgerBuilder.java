package main;

public class HesburgerBuilder implements BurgerBuilder{

    private HesburgerBurger burger;

    public void createNewBurger() { 
        burger = new HesburgerBurger();
    }

    public HesburgerBurger getBurger(){ 
        return burger;
    }

    public void buildBun() { 
        burger.setBun(new Bun("Hesen sämpylä")); 
    }

    public void buildBeef() { 
        burger.setBeef(new Beef("Hesen pihvi")); 
    }

    public void buildSauce() { 
        burger.setSauce(new Sauce("Hesen kastike")); 
    }
    
}
