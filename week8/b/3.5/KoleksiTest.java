// Elvina Neila Samas / 24060123120031

public class KoleksiTest {
    public static void main(String[] args) {
        Koleksi<Character> k = new Koleksi<>(10);
        for (char c = 'A'; c < 'A' + 10; c++) {
            k.add(c);
        }
        k.showAll();
    }
}












