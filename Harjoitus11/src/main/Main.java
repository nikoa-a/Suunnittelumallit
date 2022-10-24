package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Arvaaja1 arvaaja1 = new Arvaaja1(arvuuttaja);
        Arvaaja2 arvaaja2 = new Arvaaja2(arvuuttaja);
        Arvaaja3 arvaaja3 = new Arvaaja3(arvuuttaja);

        arvaaja1.start();
        arvaaja2.start();
        arvaaja3.start();
      
    }
    
}
