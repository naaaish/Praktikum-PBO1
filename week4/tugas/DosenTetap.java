/* Nama File: DosenTetap.java
 * Deskripsi: berisi atribut, method dan detail dari class DosenTetap 
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 13 Maret 2025
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(){
        this.nidn = " ";
    }
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public LocalDate getBUP(){
        LocalDate tanggal = getTanggalLahir();
        return tanggal.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public String getNidn(){
        return this.nidn;
    }

    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    @Override
    public void printInfo(){
        System.out.println("\nInformasi Dosen Tetap ");
        System.out.println("NIDN :  " + getNidn() + "\nNama Dosen :  " + getNama());
        System.out.println("Tanggal Lahir :  " + getTanggalLahir() + "\nTMT :  " + getTmt());
        System.out.println("Jabatan :  Dosen Tetap");
        System.out.println("Fakultas :  " + getFakultas());
        System.out.println("Masa Kerja :   " + getTahunKerja() + " tahun " + getBulanKerja() + " bulan\nBUP :  " + getBUP());
        System.out.println("Gaji Pokok :  " + getGajiPokok() + "\nTunjangan :  " + (0.02 * getTunjangan()));

    }

}
