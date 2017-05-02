import java.util.HashMap;

/**
 * Created by Toshiba on 5/1/2017.
 */
public class Makanan extends Produk {
    int idProduk;
    String namaMakanan;
    String jenisMakanan;
    int stock;
    int hargabeli;
    int hargajual;

    private HashMap<Integer,Makanan> Makanan = new HashMap<>();

    public void addStock(Makanan mk) {
        Makanan.put(mk.idProduk,mk);
    }



    public Makanan(int idProduk, String namaMakanan, String jenisMakanan, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaMakanan = namaMakanan;
        this.jenisMakanan = jenisMakanan;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Makanan cariBarang(int idProduk) {
        return Makanan.get(idProduk);
    }

    @Override
    public void print() {
        System.out.println("Nama Makanan: "+namaMakanan);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Stok: "+hitungJumlahProduk());
        System.out.println("Jumlah Harga Beli: "+hargaBeli());
        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

    public void inputMakanan(){
        Makanan mk;

        mk = new Makanan( 1, "Indomie","Mie Instan",2000,10,2300);
        addStock(mk);
        mk = new Makanan( 2, "Choco Pie","Coklat",3500,20,4500);
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
        Makanan dataMakanan = new Makanan(1, "null","null",0,0,0);
        dataMakanan.inputMakanan();
        dataMakanan.print();
        Makanan pr = dataMakanan.cariBarang(2);
        pr.print();
    }
}
