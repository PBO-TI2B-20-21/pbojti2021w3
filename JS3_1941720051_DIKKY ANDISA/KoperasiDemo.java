public class KoperasiDemo {
    private int noKTP ;
    private String nama;
    private int limit=5000000;
    private int jumlahPinjam;
    
    
    KoperasiDemo(int noKTP, String nama, int limit) {
        this.nama = nama;
        this.noKTP = noKTP;
    
    } 
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setRekening(int rekening) {
        this.noKTP = noKTP;
    }
    public String getNama() {
        return nama;
    }
    public int getNoKTP() {
        return noKTP;
    }
    public void setLimitPinjam(int limit){
        this.limit=limit;
    }

    public int getLimitPinjam() {
      return limit;
            
    }
    public int getJumlahPinjaman(){
          return jumlahPinjam;
    }
    public int pinjam(int pinjam){
       if(pinjam <= limit){
            jumlahPinjam += pinjam;  
        }
        else{
              System.out.println("Maaf, jumlah pinjaman limit");
        }
        return jumlahPinjam;
    }
    public int angsur(int angsur){
        jumlahPinjam -= angsur;
        if( angsur>(0.01*jumlahPinjam)){
            System.out.println("Angsuran anda diterima");
        }
        else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
        return jumlahPinjam;
    
   
    }

}