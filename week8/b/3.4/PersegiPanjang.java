// Elvina Neila Samas / 24060123120031
public class PersegiPanjang extends BangunDatarGenerik<double[]> {
    public PersegiPanjang(double panjang, double lebar) {
        super(new double[]{panjang, lebar});
    }
    @Override
    public double luas() {
        return value[0] * value[1];
    }
    @Override
    public double keliling() {
        return 2 * (value[0] + value[1]);
    }
}