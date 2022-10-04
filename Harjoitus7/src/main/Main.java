package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Pokemon newPokemon = new Pokemon();

        for (int i = 0; i < 20; i++) {
            newPokemon.attack();
            newPokemon.defend();
            if (i % 2 == 0) {
                newPokemon.run();
            }        
            System.out.println("Pisteet tällä hetkellä: " + newPokemon.getPoints());           
        }
    }
    
}
