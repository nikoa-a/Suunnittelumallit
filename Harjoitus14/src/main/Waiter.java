package main;

public class Waiter {

    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder bb) { 
        burgerBuilder = bb; 
    }

    public void constructBurger() {
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildBeef();
        burgerBuilder.buildSauce();
    }
    
}
