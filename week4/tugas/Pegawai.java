/* Nama File: Pegawai.java
 * Deskripsi: berisi atribut, method dan detail dari class Pegawai
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 13 Maret 2025
 */

import java.time.LocalDate;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;


    public Pegawai(){
        this.nip = " ";
        this.nama = " ";
        this.tanggalLahir = LocalDate.of(1,1,1);
        this.tmt = LocalDate.of(1,1,1);
        this.gajiPokok = 0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok ){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int getTahunKerja() {
        LocalDate now = LocalDate.of(2025, 3, 10); 
        return Math.abs(now.getYear() - tmt.getYear());
    }

    public int getBulanKerja(){
        LocalDate now = LocalDate.of(2025, 3, 10);
        if (tmt.getMonthValue() < 3){
            return (now.getMonthValue() - tmt.getMonthValue());
        } else {
            return (tmt.getMonthValue() - now.getMonthValue());
        }
    }


    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public LocalDate getTmt(){
        return this.tmt;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public double getTunjangan(){
        int masa = getTahunKerja();
        return masa * getGajiPokok();
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void printInfo(){


    }
}
