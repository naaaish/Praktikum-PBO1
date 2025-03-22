/*  Nama File    : PNS.java  
    Deskripsi    : Berisi atribut dan method untuk kelas PNS yang merupakan turunan dari class Manusia dan mengimplementasi interface Pajak
    Pembuat      : Elvina Neila Samas / 24060123120031 
    Tanggal      : 19 Maret 2025  */
public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS;
    private static final int A = 0;

    public PNS(String nama, java.util.Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return this.nip;
    }

    public void setNip(String nip){
        this.nip = nip;

    }

    public static int getJumlahPNS(){
        return counterPNS;
    }


    @Override
    public int hitungMasaKerja() {
        java.util.Calendar now = java.util.Calendar.getInstance();
        java.util.Calendar mulaiKerja = java.util.Calendar.getInstance();
        mulaiKerja.setTime(tgl_mulai_kerja);
        return now.get(java.util.Calendar.YEAR) - mulaiKerja.get(java.util.Calendar.YEAR) + A;
    }


    @Override
    public double hitungPajak() {
        return 0.10 * getPendapatan();
    }


    @Override
    public void cetakInfo() {
        System.out.println("==== informasi PNS ====");
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Pajak: " + hitungPajak());
    }
}