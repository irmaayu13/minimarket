import java.util.HashMap;

/**
 * Created by Toshiba on 5/1/2017.
 */
public class Sembako extends Produk {
    int idProduk;
    String namaSembako;
    String jenisSembako;
    int stock;
    int hargabeli;
    int hargajual;
    int kuantitas;
    int totalproduk;

    private HashMap<Integer,Sembako> Sembako = new HashMap<>();

//    public void addStock(Sembako mk) {
//        Sembako.put(mk.idProduk,mk);
//    }

    public Sembako(int idProduk, String namaSembako, String jenisSembako, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaSembako = namaSembako;
        this.jenisSembako = jenisSembako;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Sembako(int idProduk, String namaSembako, String jenisSembako, int kuantitas,int hargajual){
        this.idProduk = idProduk;
        this.namaSembako = namaSembako;
        this.jenisSembako = jenisSembako;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
        this.totalproduk = hargajual*kuantitas;
    }

//    public Sembako cariBarang(int idProduk) {
//        return Sembako.get(idProduk);
//    }
    @Override
    public void printbill() {
        System.out.println("Nama Produk: "+namaSembako);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Kuantitas: "+kuantitas);
        System.out.println("Total Bayar Produk: "+totalproduk);
    }

    @Override
    public int totalbayarproduk() {
        this.totalproduk=hargajual*kuantitas;
        return totalproduk;
    }

    @Override
    public void print() {
        System.out.println("Nama Sembako: "+namaSembako);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Keuntungan: "+hitungKeuntungan());
//        System.out.println("Jumlah Harga Beli: "+hargaBeli());
//        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

//    public void inputSembako(){
//        Sembako mk;
//
//        mk = new Sembako( 1, "Cap Ayam Jago","Beras",40000,10,55000);
//        addStock(mk);
//        mk = new Sembako( 2, "Sania","Minyak",13500,20,14500);
//        addStock(mk);
//    }

    @Override
    public double hitungKeuntungan() {
        double untung=0;
        untung=(hargajual-hargabeli)*stock;
        return untung;
    }

    @Override
    public double hitungJumlahProduk() {
        return stock;
    }

    @Override
    public double hargaBeli() {
        return hargabeli;
    }

    @Override
    public double hargaJual() {
        return hargajual;
    }

    public static void main(String[] args) {
        Sembako dataSembako = new Sembako(1, "Cap Ayam Jago","Beras",40000,10,55000);
//        dataSembako.inputSembako();
        dataSembako.print();
//        Sembako pr = dataSembako.cariBarang(2);
//        pr.print();
//        pr.);
    }
}
