/* Nama File: DosenTamu.java
 * Deskripsi: berisi atribut, method dan detail dari class DosenTamu
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 13 Maret 2025
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private LocalDate tanggalAkhir;
    private String nidk;


    public DosenTamu(){
        this.tanggalAkhir = null;
        this.nidk = " ";
    }

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate tanggalAkhir) {
        super(nip, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhir = tanggalLahir;
    }
        
    public LocalDate getTanggalAkhir(){
        return this.tanggalAkhir;
    }

    public void setTanggalAkhir(LocalDate tanggalAkhir){
        this.tanggalAkhir = tanggalAkhir;
    }

    public String getNidk(){
        return this.nidk;
    }

    public void setNidk(String nidk){
        this.nidk = nidk;
    }
      


    @Override
    public void printInfo(){
        System.out.println("\nInformasi Dosen Tamu ");
        System.out.println("NIP :  " + getNip() + "\nNIDK :  " + getNidk());
        System.out.println("Nama Dosen :  " + getNama());
        System.out.println("Tanggal Lahir :  " + getTanggalLahir() + "\nTMT :  " + getTmt());
        System.out.println("Tanggal berakhir komtrak :  " + getTanggalAkhir());
        System.out.println("Jabatan :  Dosen Tamu");
        System.out.println("Fakultas :  " + getFakultas());
        System.out.println("Masa Kerja :   " + getTahunKerja() + " tahun " + getBulanKerja() + " bulan\nBUP :  " + getBUP());
        System.out.println("Gaji Pokok :  " + getGajiPokok() + "\nTunjangan :  " + (0.025 * getTunjangan()));

    }

}
