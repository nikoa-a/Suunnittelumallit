package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Screen valkokangas = new Screen();
        Command kangasYlos = new ScreenUpCommand(valkokangas);
        Command kangasAlas = new ScreenDownCommand(valkokangas);
        WallButton nappi1 = new WallButton(kangasYlos);
        WallButton nappi2 = new WallButton(kangasAlas);

        nappi1.push();
        nappi2.push();
    }
    
}
