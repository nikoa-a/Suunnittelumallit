package main;

public class Main {

    public static void main(String[] args) throws Exception {

        // Asiakas 1

        Waiter waiter1 = new Waiter();

        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();

        waiter1.setBurgerBuilder(mcDonaldsBuilder);
        waiter1.constructBurger();

        McDonaldsBurger mcDonaldsBurger = mcDonaldsBuilder.getBurger();

        System.out.println(mcDonaldsBurger);


        // Asiakas 2

        Waiter waiter2 = new Waiter();

        BurgerBuilder pizzabuilder = new HesburgerBuilder();

        waiter2.setBurgerBuilder(pizzabuilder);
        waiter2.constructBurger();

        HesburgerBurger burger = (HesburgerBurger)pizzabuilder.getBurger();

        System.out.println(burger);

    }
    
}
