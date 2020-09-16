/**
 * AnggotaTugas2
 */
public class AnggotaTugas2 {

    String noktp, nama;
    int limit, pinjam;
    
    AnggotaTugas2(String ktp, String nama, int limit){
        this.noktp=ktp;
        this.nama=nama;
        this.limit=limit;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    void setKTP(String ktp){
        noktp = ktp;
    }
    
    void setLimit(int limit){
        this.limit=limit;
    }
    
    void setPinjam(int pinjam){
        if(pinjam>limit)
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        else
            this.pinjam += pinjam;        
    }
    
    String getNama(){
        return nama;
    }
    
    String getKTP(){
        return noktp;
    }
    
    int getLimit(){
        return limit;
    }
    
    int getPinjam(){
        return pinjam;
    }
    
    void angsur(int angsur){
        if(angsur>=(pinjam*10)/100)
            pinjam-=angsur;
        else
            System.out.println("Maaf, angsuran harus 10% dari jumlah peminjaman");
    }
    int hitung (int sisa){
         sisa = limit-pinjam;
         return sisa;
    }
}