import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by Toshiba on 4/12/2017.
 */
public class Gudang {
    String kode;
    int stok;
    Calendar cal = Calendar.getInstance();
    String keterangan;
    private HashMap<Integer, Produk> arrProduk = new HashMap<>();

    /*
         tambah Produk ke arrProduk
     */

    public void addStock(Produk itm) {

        arrProduk.put(itm.idProduk,itm);
    }

    public void print() {
        //print semua Produk
        for (Produk itm:arrProduk.values()) {
            itm.print();
        }
    }

    public void isiGudang() {
        //nanti bisa diisi dari database, untuk sekarang disii manual dulu untuk test
        addStock(new Produk(1,"Indomie","Mie Instan",2500,40,"Makanan"));
        addStock(new Produk(2,"Ultramilk","Susu",5000,10,"Minuman"));
    }

    /*
      cari objek Produk di arProduk Produk berdasarkan id
    */
    public Produk cari(int ProdukId) {
        //Produk = arrProduk.
        return arrProduk.get(ProdukId);
    }



   
    public static void main(String[] args) {
        //testing, tambah Gudang (nantinya bisa dari database)
        System.out.println("**** test class Gudang **** ");

        Gudang m = new Gudang();
        m.isiGudang();
        System.out.println("===> Testing Print isi Gudang:");
        m.print();

        System.out.println("===> Testing cari Produk:");
        Produk itm = m.cari(2); //cari Produk 2
        if (itm != null) {
            System.out.println("DProdukukan!");
            itm.print(); //hasilnya print Produk 2
        } else {
            System.out.println("Tidak DProdukukan");
        }

    }

}
