package com.motorencapsulation;

public class Motor {
    public int kecepatan = 90;
    public boolean kontakOn = false;
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kecepatan >= 100){
            System.out.println("Kecepatan melebihi batas maksimal");
        }
        else if(kontakOn == true){
            kecepatan += 5;
        }
        else{
            System.out.println("Kecepatan Tidak Bisa Bertambah Karena Mesin Off! \n");
        }
    }
    public void kurangiKesepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan Tidak Bisa Berkurang Karena Mesin Off! \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
