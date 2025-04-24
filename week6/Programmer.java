public class Programmer extends Pegawai {
    
    protected int bonus = 450000;

    public Programmer(String name){
        super(name);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("bonus: " + bonus);
        
    }
}
