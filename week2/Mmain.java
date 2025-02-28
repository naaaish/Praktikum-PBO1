/* Nama File        : Mmain.java
 * Deskripsi        : aplikasi untuk class Mahasiswa, Dosen, Matakuliah, Kendaraan
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 26 Febuari 2025
 */

public class Mmain {
    
public static void main(String[] args){
    Dosen dosen1 = new Dosen("D001", "Dr.Febri","Informatika");
    Dosen dosen2 = new Dosen("D002", "Dr.Ajeng","Fisika");
    Dosen dosen3 = new Dosen("D013", "Dr.Lana","Pendidikan Dokter");

    MataKuliah matkul1 = new MataKuliah("MK001", "Algoritma Pemrograman", 3);
    MataKuliah matkul2 = new MataKuliah("MK002", "Aljabar Linier", 3);
    MataKuliah matkul3 = new MataKuliah("MK003", "Matematika 2", 3);

    MataKuliah matkul4 = new MataKuliah("MK011", "Dasar Fisika", 3);
    MataKuliah matkul5 = new MataKuliah("MK012", "Matematika", 3);

    MataKuliah matkul6 = new MataKuliah("MK021", "Anatomi", 3);
    MataKuliah matkul7 = new MataKuliah("MK022", "Biologi Molekuler", 4);

    Kendaraan kendaraan1 = new Kendaraan("B102AR", "Mobil");
    Kendaraan kendaraan2 = new Kendaraan("H2019UA", "Motor");
    

    Mahasiswa mhs1 = new Mahasiswa("24060123120031", "Elvina", "Informatika");
    Mahasiswa mhs2 = new Mahasiswa("23120123120031", "Neila", "Kedokteran");
    Mahasiswa mhs3 = new Mahasiswa("24030123130191", "Jake", "Fisika");
    
    /* set dosen */

    mhs1.setDosenWali(dosen1);
    mhs2.setDosenWali(dosen3);
    mhs3.setDosenWali(dosen2);

    /* set kendaraan */
    mhs1.setKendaraanMhs(kendaraan2);
    mhs2.setKendaraanMhs(kendaraan1);

    /* menambahkan matkul */
    mhs1.addMatkul(matkul1);
    mhs1.addMatkul(matkul2);
    mhs1.addMatkul(matkul3);

    mhs3.addMatkul(matkul4);
    mhs3.addMatkul(matkul5);

    mhs2.addMatkul(matkul6);
    mhs2.addMatkul(matkul7);

    mhs1.printDetailMhs();
    mhs2.printDetailMhs();
    mhs3.printDetailMhs();

}
}
