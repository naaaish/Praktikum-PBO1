package tugas2;

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " merayap dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: meong");
    }
}