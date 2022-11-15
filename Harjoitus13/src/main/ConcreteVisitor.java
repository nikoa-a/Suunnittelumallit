package main;

public class ConcreteVisitor implements Visitor {

    public boolean visit(Charmander charmander, int points) {
        return points >= 10;      
    }

    public boolean visit(Charmeleon charmeleon, int points) {
        return points >= 30;
        
    }
    
}
