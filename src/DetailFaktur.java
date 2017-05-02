import java.util.ArrayList;

/**
 *
 */
public class DetailFaktur extends FakturBeli {
        String no_fakturbeli;
        int jumlah_fakturbeli;
        String tgl_masuk;
        ArrayList<Produk> daftarProduk = new ArrayList<>();
        ArrayList<DetailFaktur> detailFaktur= new ArrayList<>();


        public DetailFaktur(String no_fakturbeli, int jumlah_fakturbeli, String tgl_masuk){
            this.no_fakturbeli=no_fakturbeli;
            this.jumlah_fakturbeli=jumlah_fakturbeli;
            this.tgl_masuk=tgl_masuk;
        }

        @Override
        public double totalFakturbeli() {
            int total=0;
            for (DetailFaktur dfb : detailFaktur){
                total = total +dfb.jumlah_fakturbeli;
            }
            return total;
        }
        public void print() {
            System.out.println("No. Faktur Beli : "+no_fakturbeli);
            System.out.println("Jumlah Faktur Beli : "+jumlah_fakturbeli);
            System.out.println("Tanggal Masuk : "+tgl_masuk);

        }
        public static void main(String[] args){
            DetailFaktur dfb = new DetailFaktur("FB001",250,"02-04-2017");
            dfb.print();
            System.out.println("Total Faktur :"+dfb.totalFakturbeli());
        }
}
