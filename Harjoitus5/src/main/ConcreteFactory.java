package main;

public class ConcreteFactory implements AbstractFactory {

    private static ConcreteFactory INSTANCE = null;

    private ConcreteFactory() {

    }

    public static ConcreteFactory getInstance() {
        if (INSTANCE == null){
            INSTANCE = new ConcreteFactory();
        }
        return INSTANCE;
    }

    @Override
    public Product makeProduct() {
        return new Product();
    }

}
