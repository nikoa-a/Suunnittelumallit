package factorymethod;

public class Varusmies extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Jarrumehu();
    }

}
