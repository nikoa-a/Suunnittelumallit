public class Main {

    public static void main(String[] args) throws Exception {

        Jasper jasper = new Jasper(new Farmarit(), new TPaita(), new Lippis(), new Kengat());

        System.out.println(jasper);

    }

}
