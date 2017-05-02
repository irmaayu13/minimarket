/**
 * Created by Rima Yuliana on 01/05/2017.
 */
public class ReturBeli {
    int no_returbeli;
    String tgl_returbeli;
    String ket_returbeli;
    int jumlah_retur;

    public ReturBeli(int no_returbeli, String tgl_returbeli, String ket_returbeli, int jumlah_retur){
        this.no_returbeli = no_returbeli;
        this.tgl_returbeli = tgl_returbeli;
        this.ket_returbeli = ket_returbeli;
        this.jumlah_retur = jumlah_retur;
    }

    public double totalReturBeli(){
        int total=0;
        return total+jumlah_retur;
    }
    public void print(){
        System.out.println("No :"+no_returbeli);
        System.out.println("Tanggal :"+tgl_returbeli);
        System.out.println("Keterangan :"+ket_returbeli);
        System.out.println("Jumlah  :"+jumlah_retur);
    }

    public static void main(String[] Args){

    }
}
