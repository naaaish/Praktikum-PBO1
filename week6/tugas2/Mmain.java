
package tugas2;
import java.util.ArrayList;

public class Mmain {
    public static void main(String[] args){
        
        Anabul h1 = new Kucing("Mimi");
        Anabul h2 = new Anjing("Bruno");
        Anabul h3 =  new Burung("Rio");

        ArrayList<Anabul> peliharaan = new ArrayList<>();

        peliharaan.add(h1);
        peliharaan.add(h2);
        peliharaan.add(h3);

        for (Anabul a : peliharaan) {
            a.bersuara();
            a.gerak();
            System.out.println(); 
        }
    }
}

