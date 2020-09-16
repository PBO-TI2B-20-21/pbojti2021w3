package MotorEncapsulation;

public class Motor1 {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 25;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }

    }

    public void kurangiKecepatan() {
       //Percobaan Acces Modifier
        if (kontakOn == true) {
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin off! \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan : "+ kecepatan+ "\n");
    }
}
