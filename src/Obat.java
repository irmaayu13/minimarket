import java.util.HashMap;

/**
 * Created by Toshiba on 5/1/2017.
 */
public class Obat extends Produk{
    int idProduk;
    String namaObat;
    String jenisObat;
    int stock;
    int hargabeli;
    int hargajual;

    private HashMap<Integer,Obat> Obat = new HashMap<>();

    public void addStock(Obat mk) {
        Obat.put(mk.idProduk,mk);
    }



    public Obat(int idProduk, String namaObat, String jenisObat, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Obat cariBarang(int idProduk) {
        return Obat.get(idProduk);
    }

    @Override
    public void print() {
        System.out.println("Nama Obat: "+namaObat);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Stok: "+hitungJumlahProduk());
        System.out.println("Jumlah Harga Beli: "+hargaBeli());
        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

    public void inputObat(){
        Obat mk;

        mk = new Obat( 1, "Oskadon","Sakit Kepala",2000,10,2300);
        addStock(mk);
        mk = new Obat( 2, "Entrostop","Sakit Perut",3500,20,4500);
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
        Obat dataObat = new Obat(1, "null","null",0,0,0);
        dataObat.inputObat();
        dataObat.print();
        Obat pr = dataObat.cariBarang(2);
        pr.print();
//        pr.);
    }

}
