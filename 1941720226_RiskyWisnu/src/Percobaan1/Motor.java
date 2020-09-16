/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author Risky
 */
public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;
    
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}
