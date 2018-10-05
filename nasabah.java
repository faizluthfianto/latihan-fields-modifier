
public class nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    int noUrut=1;
    
    public void nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama Nasabah : " + namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("Maaf saldo anda tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Penarikan uang tunai sebesar " + uang + " sukses.");
            noUrut++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String message){
        if(saldo - uang < 50 ){
            System.out.println("Penarikan uang tunai sebesar " + uang + " Gagal. Maaf saldo anda tidak mencukupi.");
            noUrut++;
            pesan=message;
            return saldo;

        }else{
            System.out.println("Penarikan uang tunai sebesar " + uang + " sukses.");
            noUrut++;
            pesan=message;
           return saldo-=uang;
           
        }
        
    }
   
}
