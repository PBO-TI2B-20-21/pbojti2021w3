public class Motor {
    private int kecepatan = 90;
    private boolean kontakOn = false;
    public void nyalakanMesin() {
        kontakOn = true;
        
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
            if (kecepatan >= 100) {
                System.out.println("kecepatan telah emncapai batas maksimum!");
            }
            else {
            if(kontakOn == true) {
                kecepatan +=5;
            }
            else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!! \n");
            }
        }
    }
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        }
        else {
            System.out.println(" Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}