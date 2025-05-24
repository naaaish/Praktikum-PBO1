/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Naila
 */

// Elvina Neila Samas / 24060123120031

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
        
    }
    
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    
    
}
