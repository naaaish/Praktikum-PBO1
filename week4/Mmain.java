/* Nama File: Mmain.java
 * Deskripsi: aplikasi untuk class BangunDatar, Lingkaran dan Persegi
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 11 Maret 2025
 */


public class Mmain {

    public static void main(String[] args){

        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(3, "hijau", null);

        P1.setWarna("pink");
        P1.setBorder("putus - putus");
        P1.setSisi(8);

        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(4, "ungu", "hitam tebal");

        L1.setBorder("putih tipis");
        L1.setJari(5);
        L1.setWarna("navy");

        
        P1.printInfo();
        L1.printInfo();
        

        P2.printInfo();
        L2.printInfo();
        





    }
}
