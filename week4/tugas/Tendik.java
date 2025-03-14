/* Nama File: Tendik.java
 * Deskripsi: berisi atribut, method dan detail dari class Tendik
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 13 Maret 2025
 */

import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(){
        this.bidang = " ";
    }
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;

    }

    public String getBidang(){
        return this.bidang;
    }

    public LocalDate getBUP(){
        LocalDate tanggal = getTanggalLahir();
        return tanggal.plusYears(55).withDayOfMonth(1).plusMonths(1);
    }


    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override
    public void printInfo(){
        System.out.println("\nInformasi Tenaga Kependidikan ");
        System.out.println("NIP :  " + getNip() + "\nNama :  " + getNama());
        System.out.println("Tanggal Lahir :  " + getTanggalLahir() + "\nTMT :  " + getTmt());
        System.out.println("Jabatan :  Tenaga Kependidikan");
        System.out.println("Bidang :  " + getBidang());
        System.out.println("Masa Kerja :   " + getTahunKerja() + " tahun " + getBulanKerja() + " bulan\nBUP :  " + getBUP());
        System.out.println("Gaji Pokok :  " + getGajiPokok() + "\nTunjangan :  "  + (0.01 * getTunjangan()));


    }
}
