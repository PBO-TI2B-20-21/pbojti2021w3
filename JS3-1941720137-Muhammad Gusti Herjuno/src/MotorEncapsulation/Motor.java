package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
    kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if(kontakOn == true){
            kecepatan += 100;
            if (kecepatan <= 100) {
                kontakOn = true;
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off! \n");
        }
    }

    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bertambah karena Mesin off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else {
            System.out.println("kontak off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
}
