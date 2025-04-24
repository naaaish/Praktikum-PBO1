public class Pegawai {
    protected String name;
    protected int gajiPokok = 5000000;

    public Pegawai(String name) {
        this.name = name;
    }

    public void setNama(String name){
        this.name = name;

    }

    public void tampilData(){
        System.out.println("Nama Pegawai: " + name + "  Gaji: " + gajiPokok);

    }
}
