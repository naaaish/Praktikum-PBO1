// Elvina Neila Samas           24060123120031
import java.util.ArrayList;
public class Mmain {

    public static void main(String[] args){
        // main class person
        Person p;
        p = new Student("Sally");
        p.status(1);
        System.out.println("\n");

        // this dalam status() mereferensikan objek aktual (Student), 
        // sehingga isAsleep() versi Student yang dijalankan, dan toString() tetap versi Person.

        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps){
            emp.tampilData();
            System.out.println("\n");
        }


        // polimorfisme bermanfaat untuk menyederhanakan kode karena membuat objek objek dari class turunan (programmer dan manager) diperlakukan sebagau
        // objek dari class Pegawai, sehinggga semua objek bisa disimpan dalam satu list dan pemanggilan metode tampilData() dapat dilakukan secara sekali untuk seluruh objek
        // yang secara otomatis akan menyesuaikan dengan tipe objek aslinya


        // jika tidak menggunakan polimorfisme, saat ingin menambah pegawai4, pegawai5 dengan tipe programmmer
        // dan manajer, maka objek tersebut tidak bisa disimpan sebagai satu koleksi objek dalam sebuah array, karena bukan 1 tipe objek
        // sehingga saat ingin memanggil metode tampilData()  harus memanggil masing masing untuk setiap class
    }

}
    


        

    
    


// kalo gapake polimorfisme, gabisa dijadikan dalam 1 list penyimpanan, harus masing"
// per class dan memanggilnya juga per class, tidak bisa langsung seperti menggunakan polimorfisme