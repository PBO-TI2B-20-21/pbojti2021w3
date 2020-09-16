package MotorEncapsulation;
    //Percobaan Acces Modifier
public class MotorDemo1 {
    public static void main(String[] args) {
        Motor1 motor1 = new Motor1();
        motor1.printStatus();
        motor1.tambahKecepatan();
        
        motor1.nyalakanMesin();
        motor1.printStatus();
        
        motor1.tambahKecepatan();
        motor1.printStatus();
        
        motor1.tambahKecepatan();
        motor1.printStatus();
        
        motor1.tambahKecepatan();
        motor1.printStatus();
        motor1.tambahKecepatan();
        motor1.printStatus();
        motor1.matikanMesin();
        motor1.printStatus();
    }
    
}
