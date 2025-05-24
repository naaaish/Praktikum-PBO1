// Elvina Neila Samas / 24060123120031
import java.util.ArrayList;

public class Mmain {
    public static void main(String[] args){
        Anabul h1 = new Kucing("mochi");
        Anabul h2 = new Anjing("jayla");
        Anabul h3 = new Burung("jeje");

        Datum<Anabul> d1 = new Datum<>(h1);
        Datum<Anabul> d2 = new Datum<>(h2);
        Datum<Anabul> d3 = new Datum<>(h3);

        ArrayList<Datum<Anabul>> daftarDatum = new ArrayList<>();
        daftarDatum.add(d1);
        daftarDatum.add(d2);
        daftarDatum.add(d3);

        for (Datum<Anabul> d : daftarDatum) {
            d.simulasiPerilaku();
            System.out.println();
        }
    }
}
