// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas){
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    public Fakultas getFakultas(){
        return this.fakultas;
    }

    public static int getCounter(){
        return counter;
    }

    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas.getNama());
    }

    @Override
    public void hitung(){
        double gajipokok = fakultas.getGajiPokok();
        double tambahan = getMasaKerja() * 0.01 * gajipokok;
        double totalGaji = gajipokok + tambahan;
        System.out.println( "Gaji Dosen: Rp " + String.format("%,.0f", totalGaji).replace(",", "."));
    }


}
