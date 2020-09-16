public class DemoKoperasi {
    private String name,noKtp;
    private int pinjaman, limit,jumlah,simpanan;
       
    DemoKoperasi(String noKtp,String name, int limit){
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
        float a= simpanan*10/100;
        if (a < uang) {
        simpanan -= uang;    
        }else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

}