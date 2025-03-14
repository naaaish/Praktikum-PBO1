/* Nama File: Dosen.java
 * Deskripsi: berisi atribut, method dan detail dari class Dosen
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 13 Maret 2025
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    
    private String fakultas;

    public Dosen(){
        this.fakultas = " ";
    }
    
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;

    }

    public String getFakultas(){
        return this.fakultas;
    }

    public LocalDate getBUP(){
        LocalDate tanggal = getTanggalLahir();
        return tanggal.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }


    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }


    @Override
    public void printInfo(){
        System.out.println("\nInformasi Dosen  ");
        System.out.println("NIP :  " + getNip() + "\nNama Dosen :  " + getNama());
        System.out.println("Tanggal Lahir :  " + getTanggalLahir() + "\nTMT :  " + getTmt());
        System.out.println("Fakultas :  " + getFakultas());
        System.out.println("Masa Kerja :   " + getTahunKerja() + " tahun " + getBulanKerja() + " bulan\nBUP :  " + getBUP());
        System.out.println("Gaji Pokok :  " + getGajiPokok() );

    }


}
