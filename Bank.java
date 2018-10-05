
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        nasabah n=new nasabah();
        n.nasabah("Caroline");
        n.tabungan(10000000);
        n.ambilUang(2500000);
        n.ambilUang(700000,"Uang untuk daftar kuliah");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        nasabah n1=new nasabah();
        n1.nasabah("Febi");
        n1.tabungan(5000000);
        n1.ambilUang(2000000);
        n1.ambilUang(300000,"Uang untuk beli ikan bakar dan duren");
        
        System.out.println(n1.getSaldo());
        System.out.println(n1.getSaldo() + "  " + n1.getPesan());

        System.out.println();
        nasabah n2=new nasabah();
        n2.nasabah("Firli");
        n2.tabungan(7000000);
        n2.ambilUang(4000000);
        n2.ambilUang(2999960,"Uang untuk beli pedesan");

        System.out.println(n2.getSaldo());
        System.out.println(n2.getSaldo() + "  " + n2.getPesan());

        System.out.println();

        System.out.println("\nTotal Transaksi Ambil Uang : " + n2.noUrut);
        
    } 
}
