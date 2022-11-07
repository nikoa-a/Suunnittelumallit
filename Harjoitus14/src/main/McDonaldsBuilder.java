package main;

public class McDonaldsBuilder implements BurgerBuilder {

    private McDonaldsBurger burger;

    public void createNewBurger() { 
        burger = new McDonaldsBurger();
    }

    public McDonaldsBurger getBurger() { 
        return burger;
    }

    public void buildBun() {
        burger.setBun("McBun");     
    }

    public void buildBeef() {
        burger.setBeef("McBeef");      
    }

    public void buildSauce() {
        burger.setSauce("McSauce");     
    }
    
}
