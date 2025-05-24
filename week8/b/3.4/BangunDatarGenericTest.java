// Elvina Neila Samas / 24060123120031
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        BangunDatarGenerik<?>[] shapes = new BangunDatarGenerik<?>[]{
            new Persegi(5.0),
            new PersegiPanjang(4.0, 6.0),
            new Segitiga(3.0, 4.0, 5.0)
        };
        for (BangunDatarGenerik<?> shape : shapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println("Luas: " + shape.luas());
            System.out.println("Keliling: " + shape.keliling());
            System.out.println();
        }
    }
} 