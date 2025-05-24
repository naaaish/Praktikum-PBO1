// Elvina Neila Samas / 24060123120031
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    @Override
    public void suara() {
        System.out.println(nama + " bersuara: cuit");
    }
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: terbang");
    }
}