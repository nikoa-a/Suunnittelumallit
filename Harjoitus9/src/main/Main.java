package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        List uusiLista = new List(new StrategyOne());
        List uusiLista2 = new List(new StrategyTwo());
        List uusLista3 = new List(new StrategyThree());

        System.out.println("Strategia 1: ");
        uusiLista.listToString();
        System.out.println("");

        System.out.println("Strategia 2: ");
        uusiLista2.listToString();
        System.out.println("");

        System.out.println("Strategia 3: ");
        uusLista3.listToString();

    }
    
}
