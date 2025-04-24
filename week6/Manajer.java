public class Manajer extends Pegawai {
    protected int tunjangan = 700000;

    public Manajer(String name){
        super(name);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("tunjangan: " + tunjangan);
        
    }
}
