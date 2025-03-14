/* Nama File: Lingkaran.java
 * Deskripsi: berisi atribut, method dan detail dari class Lingkaran
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 11 Maret 2025
 */


public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        double phi = Math.PI ;
        return phi * jari * jari;

    }

    public double getKeliling(){
        double phi = Math.PI;
        return 2 * phi * jari;
    }

    @Override
    public void printInfo(){
        System.out.println("\nInformasi Lingkaran:");
        System.out.println("Jari jari: " + getJari());
        System.out.println("Warna: " + getWarna());
        System.out.println("Jenis garis tepi (border): " + getBorder());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());


    }

}
