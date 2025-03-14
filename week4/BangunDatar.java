/* Nama File: BangunDatar.java
 * Deskripsi: berisi atribut, method dan detail dari class BangunDatar
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 11 Maret 2025
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;


    public BangunDatar(){
        
    }


    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }


    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }


}