package MotorEncaplusation;
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
   
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matiMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kecepatan <100) {
            if (kontakOn==true) {
                kecepatan += 5;
            }
            else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
            }
        } else{
            System.out.println("Kecepatan sudah Maksimal");
        }
      
    }
    public void kurangiKecepatan(){
        if (kontakOn==true) {
            kecepatan -=5;
        }
    }
    public void printStatus(){
        if (kontakOn==true) {
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}
