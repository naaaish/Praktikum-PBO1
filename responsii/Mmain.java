// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public class Mmain {
    public static void main(String[] args){

        Fakultas F1 = new Fakultas("Sains dan Matematika", 8000000.0, 8000000.0);
        Fakultas F2 = new Fakultas("Kedokteran", 12000000.0, 12000000.0);

        Dosen D1 = new Dosen("Aisha", "aisha@undip.ac.id", "23142516", 4, F1);
        Dosen D2 = new Dosen("Jake", "jaeyoon@undip.ac.id", "23193726", 3, F2);

        Tendik T1 = new Tendik("Beni", "beni@undip.ac.id", "3425162", 5);

        Mahasiswa M1 = new Mahasiswa("Neila", "neila@undip.ac.id", "23537281", 3, F1);
        Mahasiswa M2 = new Mahasiswa("Elvina", "elvina@undip.ac.id", "2353737291", 4, F2);


        System.out.println("Total Civitas Akademika: " + CivitasAkademika.getCounter() + " orang");
        System.out.println("\n========= Fakultas =========");
        F1.printInfo();
        System.out.println("\n");
        F2.printInfo();

        System.out.println("\n========= Dosen =========");
        D1.printInfo();
        D1.hitung();
        System.out.println("\n");
        D2.printInfo();
        D2.hitung();
        System.out.println("\n");
        System.out.println("Jumlah Dosen: " + Dosen.getCounter() + " orang\n");

        System.out.println("========= Mahasiswa =========");
        M1.printInfo();
        M1.hitung();
        System.out.println("\n");
        M2.printInfo();
        M2.hitung();
        System.out.println("\n");
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounter() + " orang\n");


        System.out.println("========= Tenaga Kependidikan =========");
        T1.printInfo();
        T1.hitung();
        System.out.println("\n");
        System.out.println("Jumlah Tendik: " + Tendik.getCounter());
    }
}
