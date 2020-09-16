
package motorencapsulation;
/**
 * 07_BimaGilangL
 */
public class MotorDemo {
    public static void main (String[] args){
        Motor mt = new Motor();
        mt.printStatus();
        mt.tambahKecepatan();
            
        mt.nyalakanMesin();
        mt.printStatus();
                mt.tambahKecepatan();
                mt.printStatus();
                mt.tambahKecepatan();
                mt.printStatus();
                mt.tambahKecepatan();
                mt.printStatus();
                mt.tambahKecepatan();
                mt.printStatus();
        mt.matikanMesin();
        mt.printStatus();
    }
}
