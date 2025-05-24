/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodegenerik;

/**
 *
 * @author Naila
 */
import java.util.ArrayList;


public class Mmain {
    public static void main(String[] args) {
        Datum<Anabul> d1 = new Datum<>(new Kucing("mochi"));
        Datum<Anabul> d2 = new Datum<>(new Anjing("jayla"));
        Datum<Anabul> d3 = new Datum<>(new Burung("jeje"));

        ArrayList<Datum<Anabul>> daftar = new ArrayList<>();
        daftar.add(d1);
        daftar.add(d2);
        daftar.add(d3);

        System.out.println("------ sebelum perubahan -------");
        ContohMetodeGenerik.tampilkanSemua(daftar);
        
        System.out.println("------ mengubah isi d1 menjadi burung cici ------ \n");
        ContohMetodeGenerik.ubahIsi(d1, new Burung("cici"));

        System.out.println("------ setelah perubahan -------");
        ContohMetodeGenerik.tampilkanSemua(daftar);
    }
}

