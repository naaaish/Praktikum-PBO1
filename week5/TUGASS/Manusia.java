/*  Nama File    : Manusia.java  
    Deskripsi    : Berisi atribut dan method untuk kelas abstrak Manusia
    Pembuat      : Elvina Neila Samas / 24060123120031 
    Tanggal      : 19 Maret 2025  */


public abstract class Manusia {
    protected String nama;
    protected java.util.Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia(String nama, java.util.Date tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama(){
        return nama;
    }

    public java.util.Date getTanggalMulai(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getJumlahManusia(){
        return counterMns;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void getTanggalMulai(java.util.Date tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double penghasilan){
        this.pendapatan = penghasilan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }

    public abstract int hitungMasaKerja();
    
}