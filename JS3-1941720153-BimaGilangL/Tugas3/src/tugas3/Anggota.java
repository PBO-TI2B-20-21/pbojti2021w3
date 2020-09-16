
package tugas3;
/**
 * 07_BimaGilangL
 */
public class Anggota {
    private String nama, noKtp;
    private int limit,pinjaman;
        Anggota(String noKtp, String nama, int limit){
            this.noKtp = noKtp;
            this.nama = nama;
            this.limit = limit;
            pinjaman = 0;
        }
        public String getNama(){
            return nama;
        }
        public int getLimitPinjam(){
            return limit;
        }
        public void pinjaman(int pinjaman){
            if(limit>pinjaman){
                this.pinjaman += pinjaman;
                limit -= pinjaman;
            } else {
                System.out.println("Sorry, jumlah pinjaman lebih dari limit!!");
            }
        }
        public int getJumlahPinjaman(){
            return pinjaman;
        }
        public void angsur(int angsur){
            double minimum = pinjaman*0.1;
            if (angsur > (int)minimum){
             pinjaman -= angsur;   
            } else {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman!!");
            }
            
        }
}
