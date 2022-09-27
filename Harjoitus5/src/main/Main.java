package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        ConcreteFactory tehdas = ConcreteFactory.getInstance();

        Product product = tehdas.makeProduct();

        System.out.println(product);
    }

}
