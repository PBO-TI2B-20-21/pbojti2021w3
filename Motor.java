
package motorencapsulation;

/**
 *
 * @author Bedman
 */
public class Motor {
    public int kecepatan=0;
    private boolean kontakOn =false;
    public void nyalakanMesin(){
        kontakOn=true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if (kontakOn==true) {
            kecepatan+=5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn==true) {
            kecepatan-=5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Mati");
        }
    }
    public void printStatus(){
        if (kontakOn== true) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan "+kecepatan);
    }
}
