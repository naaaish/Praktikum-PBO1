/*  Nama File    : Petani.java  
    Deskripsi    : Berisi atribut dan method untuk kelas Petani yang merupakan turunan dari class Manusia dan mengimplementasi interface Pajak
    Pembuat      : Elvina Neila Samas / 24060123120031 
    Tanggal      : 19 Maret 2025  */

public class Petani extends Manusia implements Pajak{


    private String asal_kota;
    private static int counterPetani;
    private static final int C = 0; // nim digit 12 = 0

    public Petani(String nama, java.util.Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return this.asal_kota;
    }

    public static int getJumlahPetani(){
        return counterPetani;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja() {
        java.util.Calendar now = java.util.Calendar.getInstance();
        java.util.Calendar mulaiKerja = java.util.Calendar.getInstance();
        mulaiKerja.setTime(tgl_mulai_kerja);
        return now.get(java.util.Calendar.YEAR) - mulaiKerja.get(java.util.Calendar.YEAR) + C;
    }
    
    @Override
    public double hitungPajak() {

        return 0;
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("==== informasi petani =====");
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Pajak: " + hitungPajak());
    }
}