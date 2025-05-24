// Elvina Neila Samas / 24060123120031
public class Persegi extends BangunDatarGenerik<Double> {
    public Persegi(Double sisi) {
        super(sisi);
    }
    @Override
    public double luas() {
        return value * value;
    }
    @Override
    public double keliling() {
        return 4 * value;
    }
}