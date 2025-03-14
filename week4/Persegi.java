/* Nama File: Persegi.java
 * Deskripsi: berisi atribut, method dan detail dari class Persegi
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 11 Maret 2025
 */


public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(int sisi, String warna, String border){
        super(4, warna, border);
        this.sisi= sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        System.out.println("\nInformasi Persegi:");
        System.out.println("Panjang Sisi: " + getSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Jenis garis tepi (border): " + getBorder());
        System.out.println("Luas:" + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}

