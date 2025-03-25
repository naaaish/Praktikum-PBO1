// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public abstract class CivitasAkademika {
    private String nama;
    private String email;
    private static int counter = 0;

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
        counter++;
    }

    public String getNama(){
        return this.nama;
        
    }

    public String getEmail(){
        return this.email ;
    }

    public static int getCounter(){
        return counter;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void printInfo(){
        System.out.println("Nama Fakultas: " + nama);
        System.out.println("Email: " + email);
    }

    public abstract void hitung();      // jumlah gaji untuk dosen & tendik, biaya ukt untuk mahasiswa
}
