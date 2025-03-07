/* Nama File: Asersi1.java
 * Deskripsi: berisi implementasi program java yang menggunakan assertion mengenai bilangan positif dan negatif
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 06 Maret 2025
 */

public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if (x>0) {
            System.out.println("x bilangan positif");

        } else {
            assert(x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
            
        }

    }
}