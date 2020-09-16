public class Anggota {
    public String noKTP, nama;
    private float limit, Pinjaman;

    Anggota(String noKTP, String nama, float limit) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNama() {
        return nama;
    }
    public void setKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    public float getLimitPinjaman() {
        return limit;
    }
    public void pinjam(float pinjaman){
        if (limit > pinjaman) {
            this.Pinjaman += pinjaman;
            limit -= pinjaman;
        }else {
            System.out.println("MAAF!! Pinjaman melebihi limit \n");
        }
    }
    public float getJumlahPinjaman(){
        return Pinjaman;
    }
    public void angsur(float angsur){
        float minAngsur = Pinjaman * 0.1f;
        if(angsur > minAngsur){
            Pinjaman -= angsur;
        }
        else {
            System.out.println("Maaf!! Angsuran minimal 10% dari jumlah pinjaman");
        }
    }

}
