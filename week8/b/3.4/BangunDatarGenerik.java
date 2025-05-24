// Elvina Neila Samas / 24060123120031
public abstract class BangunDatarGenerik<T> {
    protected T value;
    public BangunDatarGenerik(T data) {
        this.value = data;
    }
    public abstract double luas();
    public abstract double keliling();
}