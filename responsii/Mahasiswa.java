// nim , nama   : Elvina Neila Samas, 24060123120031
// tanggal      : 23 Maret 2025

public class Mahasiswa extends CivitasAkademika{

    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas){
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public String getNim(){
        return this.nim;
    }

    public int getSemester(){
        return this.semester;
    }

    public Fakultas getFakultas(){
        return this.fakultas;
    }

    public static int getCounter(){
        return counter;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        
    }

    
    public double hitungUkt(){
        return fakultas.getUkt() * Math.pow(0.95, semester - 1);
    }
    
    @Override
    public void hitung() {
        System.out.println( "UKT: Rp " + String.format("%,.0f", hitungUkt()).replace(",", "."));
    }


}