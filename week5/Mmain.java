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
        

        // BangunDatar B1 = new BangunDatar();              salah karena kelas abstrak tidak bisa diinisialisasi
        BangunDatar p1 = new Persegi(10, null, null);
        Persegi p2 = new Persegi(5, null, null);
        BangunDatar l1 = new Lingkaran();
        // Lingkaran L1 = new Lingkaran (14, null, null)

        P1.zoomIn();
        P1.printInfo();



    }
}
