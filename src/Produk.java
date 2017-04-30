import java.util.HashMap;

/**
 * Created by jordh on 4/12/2017.
 */
public class Produk {
    int idProduk;
    String namaProduk;
    String jenisProduk;
    int stock;
    int harga;
    String kategori;

    public Produk(int idProduk, String namaProduk, String jenisProduk, int harga, int stock, String kategori){
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.jenisProduk = jenisProduk;
        this.stock = stock;
        this.harga = harga;
        this.kategori = kategori;
    }

    private HashMap<Integer,Produk> Produk = new HashMap<>();

    public void addProduk(Produk pr) {
        Produk.put(pr.idProduk,pr);
    }

    public Produk cariBarang(int idProduk) {
        return Produk.get(idProduk);
    }

    public void print() {
        System.out.println("Nama Produk:"+namaProduk);
        System.out.println("Harga:"+harga);
        System.out.println("Stok:"+stock);
    }

    public void inputProduk(){
        Produk pr;

        pr = new Produk( 1, "Indomie","Mie Instan",2000,10 ,"Makanan" );
        addProduk(pr);
        pr = new Produk( 2, "Teh Botol","Minuman Siap Saji",3500,20,"Minuman" );
        addProduk(pr);
    }

    public static void main(String[] args) {
        Produk dataProduk = new Produk(1, "null","null",0,0,"null");
        dataProduk.inputProduk();
        Produk pr = dataProduk.cariBarang(2);
        pr.print();
    }
}
