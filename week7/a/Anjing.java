// Elvina Neila Samas / 24060123120031
class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " merayap dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: guk-guk");
    }
}