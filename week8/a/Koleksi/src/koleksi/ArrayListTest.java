/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author Naila
 */
// Elvina Neila Samas / 24060123120031

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        strings.remove("praktikum");
        
        for (String s : strings){
            System.out.println(s + " " );
        }
    }
}
