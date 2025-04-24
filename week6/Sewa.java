// Elvina Neila Samas       24060123120031
public class Sewa {

    public static void hitungSewa(Vehicle v){
        v.calRent(50, 1000);
    }

    public static void main(String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        // tanpa method hitungSewa()
        System.out.println("Output tanpa method hitungSewa()");
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        // dengan method hitungSewa()
        System.out.println("\nOutput dengan method hitungSewa()");
        hitungSewa(kendaraan); 
        hitungSewa(mobil);     
        hitungSewa(bis);       
    }
    
    // dengan method hitungSewa(), kode dapat menjadi lebih sederhana dan fleksibel karena hanya perlu
    // 1 fungsi hitungSewa(Vehicle v) saja, lalu pemanggilan method akan memanggil versi method dari subclass
    // masing masing secara otomatis jika ada override
}
