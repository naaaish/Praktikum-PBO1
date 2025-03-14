/* Nama File: Mmain.java
 * Deskripsi: aplikasi untuk class Pegawai, Dosen, Tendik, DOsenTetap dan DosenTamu
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 13 Maret 2025
 */

import java.time.LocalDate;

public class Mmain {
    public static void main(String[] args){

        DosenTetap D1 = new DosenTetap();
        DosenTamu D2 = new DosenTamu("1008", "8872", "Alia", LocalDate.of(1989, 9,12), LocalDate.of(2019,8,20), 5000.0, "Sains dan Matematika", LocalDate.of(2025,9,1) );

        D1.setNama("Jungwoo");
        D1.setNidn("8816");
        D1.setNip("1009");
        D1.setTanggalLahir(LocalDate.of(1998, 2, 19));
        D1.setFakultas("Kedokteran");
        D1.setTmt(LocalDate.of(2024,11,25));
        D1.setGajiPokok(20000.0);
        
        D1.printInfo();
        D2.printInfo();


        Tendik T1 = new Tendik();
        Tendik T2 = new Tendik("0092", "Sean", LocalDate.of(1998,4,9), LocalDate.of(2025,1,1), 3500.0, "Kemahasiswaan" );

        T1.setNama("Nabila");
        T1.setNip("34567");
        T1.setTanggalLahir(LocalDate.of(1999, 8, 10));
        T1.setTmt(LocalDate.of(2024, 2, 15));
        T1.setBidang("Akademik");
        T1.setGajiPokok(2500.0);

        T1.printInfo();
        T2.printInfo();
    }
}
