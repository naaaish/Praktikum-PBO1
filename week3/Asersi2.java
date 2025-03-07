/* Nama File: Asersi2.java
 * Deskripsi: berisi implementasi program java yang menggunakan assertion mengenai lingkaran
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 06 Maret 2025
 */
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        assert (keliling > 0) : "Keliling tidak boleh nol!";
        return keliling;
    }
}



public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double keliling = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + keliling);
    }
}


// PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
// jawaban: Pada line 24, assert (jariJari > 0) : "jari jari tidak boleh nol!"; 
// asersi ini tidak mencegah pembuatan objek Lingkaran dengan jari-jari 
// nol, karena asersi hanya aktif jika dijalankan dengan -ea (enable assertions).

// Pada line 10 assert (keliling > 0) : "Keliling tidak boleh nol!";
// jika jariJari = 4, asersi akan gagal, tetapi objek Lingkaran tetap dapat dibuat, validasi 
// untuk memastikan bahwa jari jari tidak nol seharusnya dilakukan di konstruktor agar objek dengan 
// nilai tidak valid tidak dapat dibuat.

// solusi: validasi dibuat di konstruktor dengan menggunakan if agar objek Lingkaran tidak 
// dapat dibuat dengan jari-jari ≤ 0. 
// Mengunakan exception (IllegalArgumentException), bukan hanya asersi untuk menangani input yang tidak valid.