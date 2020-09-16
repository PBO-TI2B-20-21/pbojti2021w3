package TugasKoperasi;

public class Anggota1 {
    private String ktp;
    private String nama;
    public float jmlhPinjam;
    private float limitPinjaman;

    Anggota1(String ktp, String nama, float limit) {
        this.ktp = ktp;
        this.nama = nama;
        this.jmlhPinjam = 0;
        this.limitPinjaman = limit;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getJmlhPinjam() {
        return jmlhPinjam;
    }


    public float getLimitPinjaman() {
        return limitPinjaman;
    }

    public void pinjam(float jmlhPinjam) {
        if (limitPinjaman > jmlhPinjam){
            this.jmlhPinjam += jmlhPinjam;
            limitPinjaman -= jmlhPinjam;
        }
        else {
            System.out.println("Maaf jumlah pinjaman anda melebihi batas pinjaman");
        }
    }

    public void angsur(float angsur){
       double minAngsur = jmlhPinjam + 0.1;
       if (angsur > minAngsur){
           jmlhPinjam -= angsur;
       }
       else{
           System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
       }
    }
}

