// Elvina Neila Samas / 24060123120031
public class AnabulTest {
    public static void main(String[] args) {
        KoleksiAnabul k = new KoleksiAnabul(10);

        k.add(new Kucing("kucing a"));
        k.add( new Anjing("anjing b"));
        k.add(new Burung("burung c"));
        k.add(new Kucing("kucing d"));
        k.add(new Anjing("anjing e"));
        k.add( new Burung("burung f"));
        k.add( new Anjing("anjing g"));

        k.showAll();
    }
}
