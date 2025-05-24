// Elvina Neila Samas / 24060123120031
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
    @Override
    public void suara() {
        System.out.println(nama + " bersuara: meong");
    }
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: melata");
    }
}