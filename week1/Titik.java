public class Titik {
    /**************** ATRIBUT *****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**************** METHOD *****************/
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;

    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }  

    // menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + " , " + ordinat + ")");
    }

    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        } else if(absis < 0 && ordinat > 0){
            return 2;
        } else if(absis < 0 && ordinat < 0) {
            return 3;
        } else {    //(absis > 0 and ordinat < 0)
            return 4;
        }
    }

    double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    double getJarak(Titik T){
        return Math.sqrt(((this.absis - T.absis) * (this.absis - T.absis)) + ((this.ordinat * T.ordinat) * (this.ordinat * T.ordinat)));
    }

    void refleksiX(){
        absis = absis * (-1);
    }

    void refleksiY(){
        ordinat = ordinat * (-1);
    }

    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
} // end class  titik