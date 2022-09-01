package main;

import main.adidas.AdidasFactory;
import main.boss.BossFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        Jasper opiskelijaJasu = Jasper.createJasper(new AdidasFactory());
        Jasper insinooriJasu = Jasper.createJasper(new BossFactory());

        System.out.println(opiskelijaJasu);
        System.out.println(insinooriJasu);

    }

}
