// Elvina Neila Samas / 24060123120031
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
    @Override
    public void suara() {
        System.out.println(nama + " bersuara: guk-guk");
    }
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: melata");
    }
}