package MotorEncaplusation;
public class AnggotaKoperasi {
    private String name,noKtp;
    private int pinjaman, limit,jumlah,simpanan;
       
    AnggotaKoperasi(String noKtp,String name, int limit){
        this.name = name;
        this.noKtp = noKtp;
        this.limit = limit;
    }
    public void setName(String newName){
    name = newName;
    }
    public void setNoKtp(String newnoKtp){
    noKtp = newnoKtp;
    }
    public String getName(){
    return name;
    }
    public String getNoKtp(){
    return noKtp;
    }
    public int getLimitPinjaman(){
    return limit;
    }
    public void pinjam (int uang){
        if (uang>limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
        simpanan += uang;
        }
    }
    public int getJumlahPinjam(){
    return simpanan;
    }
    public void angsur(float uang){
        if (simpanan*10/100 < uang) {
        simpanan -= uang;    
        }else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

}
