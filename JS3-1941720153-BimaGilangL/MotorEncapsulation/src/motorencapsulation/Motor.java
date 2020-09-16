
package motorencapsulation;
/**
 * 07_BimaGilangL
 */
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
                kecepatan += 25;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF!");
            }
        }
        public void kurangiKecepatan(){
            if(kontakOn == true){
                kecepatan -= 25;
            } else {
                System.out.println("Kecepatan tidak bisa dikurangi karena mesin OFF!!");
            }
        }
        public void printStatus(){
            if(kontakOn == true){
                System.out.println("Kontak ON");
            } else {
                System.out.println("Kontak OFF");
            }
            System.out.println("Kecepatan " +kecepatan);
        }
}
