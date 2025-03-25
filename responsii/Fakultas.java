// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public class Fakultas {
    private String nama;
    private double ukt;
    private double gajiPokok;

    public Fakultas(String nama, double ukt, double gajiPokok){
        this.nama = nama;
        this.ukt = ukt;
        this.gajiPokok = gajiPokok;
    }

    public String getNama(){
        return this.nama;
        
    }

    public double getUkt(){
        return this.ukt;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setUkt(double ukt){
        this.ukt = ukt;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void printInfo(){
        System.out.println("Nama Fakultas: " + nama);
        System.out.println( "Tarif UKT: Rp " + String.format("%,.0f", ukt).replace(",", "."));
        System.out.println( "Gaji Pokok: Rp " + String.format("%,.0f", gajiPokok).replace(",", "."));
    }
}
