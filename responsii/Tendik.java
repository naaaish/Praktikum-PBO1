// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public class Tendik extends Karyawan{
    private static final double gajiPokok = 4000000.0;
    private static int counter = 0;

    public Tendik(String nama, String email, String nip, int masaKerja){
        super(nama, email, nip, masaKerja);
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    @Override
    public void hitung(){
        double tambahan = getMasaKerja() * 0.01 * gajiPokok;
        double totalGaji = gajiPokok + tambahan;
        System.out.println( "Gaji Tendik: Rp " + String.format("%,.0f", totalGaji).replace(",", "."));
    }
}
