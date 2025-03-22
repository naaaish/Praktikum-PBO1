/*  Nama File    : Pengusaha.java  
    Deskripsi    : Berisi atribut dan method untuk kelas Pengusaha yang merupakan turunan dari class Manusia dan mengimplementasi interface Pajak
    Pembuat      : Elvina Neila Samas / 24060123120031 
    Tanggal      : 19 Maret 2025  */

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha;
    private static final int B = 3;

    public Pengusaha(String nama, java.util.Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return this.npwp;
    }

    public static int getJumlahPengusaha(){
        return counterPengusaha;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        java.util.Calendar now = java.util.Calendar.getInstance();
        java.util.Calendar mulaiKerja = java.util.Calendar.getInstance();
        mulaiKerja.setTime(tgl_mulai_kerja);
        return now.get(java.util.Calendar.YEAR) - mulaiKerja.get(java.util.Calendar.YEAR) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        System.out.println("==== informasi pengusaha =====");
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Pajak: " + hitungPajak());
    }
}