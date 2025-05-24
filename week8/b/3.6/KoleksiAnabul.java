// Elvina Neila Samas / 24060123120031
public class KoleksiAnabul extends Koleksi<Anabul> {
    public KoleksiAnabul(int kapasitas) {
        super(kapasitas);
    }
    @Override
    public void showAll() {
        System.out.println("Isi KoleksiAnabul (" + getSize() + " elemen): ");
        for (int i = 0; i < getSize(); i++) {
            Anabul a = getIsi(i);
            if (a != null) {
                System.out.println("Nama: " + a.getNama());
                a.suara();
                a.gerak();
                System.out.println();
            }
        }
    }
}