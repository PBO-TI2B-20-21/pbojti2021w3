package MotorEncapsulation;


//Percobaan Enkapsulasi
public class Motor {

    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kotak on");
        } else {
            System.out.println("Kotak off");
        }
        System.out.println("Kecepatan" +kecepatan+"\n");
    }

}
