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

    private HashMap<Integer,Sembako> Sembako = new HashMap<>();

    public void addStock(Sembako mk) {
        Sembako.put(mk.idProduk,mk);
    }



    public Sembako(int idProduk, String namaSembako, String jenisSembako, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaSembako = namaSembako;
        this.jenisSembako = jenisSembako;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Sembako cariBarang(int idProduk) {
        return Sembako.get(idProduk);
    }

    @Override
    public void print() {
        System.out.println("Nama Sembako: "+namaSembako);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Stok: "+hitungJumlahProduk());
        System.out.println("Jumlah Harga Beli: "+hargaBeli());
        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

    public void inputSembako(){
        Sembako mk;

        mk = new Sembako( 1, "Cap Ayam Jago","Beras",40000,10,55000);
        addStock(mk);
        mk = new Sembako( 2, "Sania","Minyak",13500,20,14500);
        addStock(mk);
    }

    @Override
    public double hitungJumlahProduk() {
        double total = 0;
        total = total + stock;
        return total;
    }

    @Override
    public double hargaBeli() {
        double total = 0;
        total = total + hargabeli;
        return total;
    }

    @Override
    public double hargaJual() {
        double total = 0;
        total = total + hargajual;
        return total;
    }

    public static void main(String[] args) {
        Sembako dataSembako = new Sembako(1, "null","null",0,0,0);
        dataSembako.inputSembako();
        dataSembako.print();
        Sembako pr = dataSembako.cariBarang(2);
        pr.print();
//        pr.);
    }
}
