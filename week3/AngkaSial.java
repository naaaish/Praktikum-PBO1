/* Nama File: AngkaSial.java
 * Deskripsi: berisi implementasi program yang menangani eksepsi penanganan angka sial
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 06 Maret 2025
 */
public class AngkaSial {
    public void cobaangka(int angka) throws AngkaSialException {
        if (angka == 13){
            throw new AngkaSialException();

        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args){

        AngkaSial as = new AngkaSial();
        try{
            as.cobaangka(10);
            as.cobaangka(13);
            as.cobaangka(12);

        } catch (AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukan angka");
        }
    }
    
}

// Pertanyaan
//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
//jawaban: kode pada baris 12 akan dieksekusi jika angka yang dimasukkan bukan angka sial/13.
// jika angka yang dimasukkan adalah 13, maka baris 12 tidak akan dieksekusi karena sebelum 
// mencapai baris tersebut, program sudah melempar eksepsi (throw new AngkaSialException();).


// Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
// jawaban:  Baris ke 21, yaitu as.cobaangka(12); tidak dieksekusi karena pada baris sebelumnya yaitu baris 20
// terjadi exception pada as.cobaAngka(13), sehingga kendali program langsung berpindah ke blok catch, melewati 
// sisa kode dalam blok try yang menyebabkan baris 21 tidak dieksekusi