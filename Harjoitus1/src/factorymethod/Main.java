package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus varusmies = new Varusmies();
        opettaja.aterioi();
        oppilas.aterioi();
        varusmies.aterioi();
    }
}
