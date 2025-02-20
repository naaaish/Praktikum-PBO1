/* Nama File        : Garis.java
 * Deskripsi        : berisi atribut dan method dalam class Garis
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 18 Febuari 2025
 */


public class Garis {
    /**************** ATRIBUT *****************/
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    /**************** METHOD *****************/

    /* KONSTRUKTOR */
    Garis() {
        awal = new Titik(0,0);
        akhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik Ta, Titik Tb){
        awal = Ta;
        akhir = Tb;
        counterGaris++;
    }

    /* SELEKTOR */
    static int getCounterGaris(){
        return counterGaris;
    }

    double getAbsisAwal(){
        return awal.absis;
    }

    double getOrdinatAwal(){
        return awal.ordinat;
    }

    double getAbsisAkhir(){
        return akhir.absis;
    }

    double getOrdinatAkhir(){
        return akhir.ordinat;
    }

    /* MUTATOR */
    void setAbsisAwal(double x){
        awal.absis = x;
    }

    void setOrdinatAwal(double y){
        awal.ordinat = y;
    }  

    void setAbsisAkhir(double x){
        akhir.absis = x;
    }

    void setOrdinatAkhir(double y){
        akhir.ordinat = y;
    }  

    void setKoordinatAwalGaris(Titik awal) {
        this.awal = awal;
    }

    void setKoordinatAkhirGaris(Titik akhir) {
        this.akhir = akhir;
    }


    // Method untuk mendapatkan panjang sebuah garis.
    double panjangGaris(){
        return Math.sqrt(((awal.absis - akhir.absis) * (awal.absis - akhir.absis)) + ((awal.ordinat - akhir.ordinat) * (awal.ordinat - akhir.ordinat)) );
    }


    //Method untuk mendapatkan gradien dari sebuah garis.
    double gradienGaris(){
        if (akhir.absis == awal.absis){
            return 0;       // gradien tidak ditemukan karena garis vertikal
        } else {
            return ((akhir.ordinat - awal.ordinat) / (akhir.absis - awal.absis)); 
        }
    }


    //Method untuk mendapatkan titik tengah dari sebuah garis.
    void cariTengah(){
        double x = (awal.absis + akhir.absis) / 2;
        double y = (awal.ordinat + akhir.ordinat) / 2;
        
        System.err.println("Titik Tengah : (" + x + " , " + y + ")");
    }
    
    // Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya,
    boolean isSejajar(Garis G){
        double gradien1 = this.gradienGaris();
        double gradien2 = G.gradienGaris();
        
        return gradien1 == gradien2;
    }
    
    // Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    boolean isTegakLurus(Garis G){
        double gradien1 = this.gradienGaris();
        double gradien2 = G.gradienGaris();
        
        return gradien1 * gradien2 == -1;
        
    }

    // Method untuk menampilkan ke layar titik awal dan titik akhir garis.
    void printKoordinatAwalGaris(){
        System.err.println("(" + awal.absis + " , " + awal.ordinat + ")");
    }

    void printKoordinatAkhirGaris(){
        System.err.println("(" + akhir.absis + " , " + akhir.ordinat + ")");
    }

    void printKoordinatGaris(){
        System.err.println("(" + awal.absis + " , " + awal.ordinat + ")" + " , " + "(" + akhir.absis + " , " + akhir.ordinat + ")" );
    }


    //Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    void persamaanGaris(){
        double m = gradienGaris();
        double c = awal.getAbsis() - m * awal.getOrdinat();
        if(c >= 0){
            System.err.println("y = " + m + "x + " + c );
        } else {
            System.err.println("y = " + m + "x - " + Math.abs(c) );
        }



        
    }
}
