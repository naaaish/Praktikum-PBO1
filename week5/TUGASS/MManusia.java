/*  Nama File    : MManusia.java  
    Deskripsi    : Program utama untuk menjalankan kelas abstrak Manusia, dan turunannya(PNS, Pengusaha, Petani), serta interface Pajak
    Pembuat      : Elvina Neila Samas / 24060123120031 
    Tanggal      : 19 Maret 2025  */

public class MManusia {
    public static void main(String[] args) {
        // Membuat format tanggal 
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
        
        try {
            
            PNS p1 = new PNS("Satriyo", sdf.parse("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");
            Pengusaha pe1 = new Pengusaha("Adhy", sdf.parse("10-02-2010"), "Jl.Air", 55000000, "000-556-773-212-000-5");
            Petani pt1 = new Petani("Nugraha", sdf.parse("09-01-1977"), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
            PNS p2 = new PNS("Panji", sdf.parse("01-04-2010"), null, 10000000.0, "198004212010041002");
    
            p2.setAlamat("Jl. Panorama 111 Tembalang");

            // informasi jumlah objek
            System.out.println("\nJumlah Manusia = " + Manusia.getJumlahManusia());
            System.out.println("Jumlah PNS = " + PNS.getJumlahPNS());
            System.out.println("Jumlah Pengusaha = " + Pengusaha.getJumlahPengusaha());
            System.out.println("Jumlah Petani = " + Petani.getJumlahPetani());
    
            //  informasi pajak
            System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());
            System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
            System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
    
            //  informasi masa kerja
            System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
            System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
            System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
    
            // informasi lengkap
            System.out.println("\nInformasi Lengkap:");
            p1.cetakInfo();
            System.out.println();
            pe1.cetakInfo();
            System.out.println();
            pt1.cetakInfo();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan format tanggal");
        }
    }
}