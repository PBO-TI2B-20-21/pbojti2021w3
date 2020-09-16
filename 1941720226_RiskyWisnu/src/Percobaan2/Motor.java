/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author Risky
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan += 5;
        }
        if (kecepatan <= 100){
            kontakOn = true;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("kontak On");
        }
        else{
            System.out.println("kontak Off");
        }
        System.out.println("kecepatan " + kecepatan+"\n");
    }
}
