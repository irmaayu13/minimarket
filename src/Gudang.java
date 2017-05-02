import java.util.ArrayList;

/**
 * Created by Toshiba on 4/12/2017.
 */
public class Gudang {
    Produk produk;
    Supplier supplier;
    int jumlahStock;
    ArrayList<Object> daftarProduk = new ArrayList<>();

    public Gudang(Produk p, Supplier s, int jumlahStock){
        this.produk=p;
        this.supplier=s;
        this.jumlahStock=jumlahStock;
    }

//    public void ambilData(Produk produk){
////        double total=0;
//        daftarProduk.get(produk);
//        for(Produk p : daftarProduk ){
////            total=total+p.hitungJumlahProduk();
//            p.print();
//        }
//    }




   
    public static void main(String[] args) {
//        Makanan m = new Makanan(1,"Sari Roti","roti",4000,10,5000);
//
//       Gudang g = new Gudang(p,s,20);

    }

}
