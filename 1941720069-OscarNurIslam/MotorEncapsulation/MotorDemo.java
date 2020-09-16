package MotorEncapsulation;
//Percobaan Enkapsulasi
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor(); //instansiasi objek
  motor.printStatus();   
  motor.kecepatan=50;
  motor.printStatus();
    }
}
