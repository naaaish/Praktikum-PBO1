// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public abstract class Karyawan extends CivitasAkademika {
    private String nip;
    private int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja){
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public String getNip(){
        return this.nip;
    }

    public int getMasaKerja(){
        return this.masaKerja;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }


    public abstract void hitung();
}
