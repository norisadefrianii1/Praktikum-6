package marketplace;

import java.util.*;

public class ProductManager {
    // List untuk menyimpan daftar semua produk
    protected List<Product<?>> products = new ArrayList<>();
    // Set untuk menyimpan kategori unik dari produk
    private Set<String> categories = new HashSet<>();
    // Queue untuk menyimpan produk yang sudah diproses
    private Queue<Product<?>> processedQueue = new LinkedList<>();

    // Method untuk menambahkan produk ke dalam daftar produk
    public void TambahProduk(Product<?> product) {
        products.add(product);
        categories.add(product.getCategory().toString());
    }

    // Method untuk menghapus produk berdasarkan ID
    public void HapusProdukbyID(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Method untuk mencari produk berdasarkan nama dan kategori
    public void CariProduk(String name, String category) {
        for (Product<?> p : products) {
            if (p.getName().equalsIgnoreCase(name) &&
                    p.getCategory().toString().equalsIgnoreCase(category)) {
                System.out.println(p);
            }
        }
    }

    // Method untuk menampilkan semua produk yang ada
    public void MenampilkanProduk() {
        System.out.printf("%-5s %-15s %-15s %-10s\n", "ID", "Name", "Category", "Price");
        // Menyalin daftar produk ke dalam list baru untuk diurutkan
        List<Product<?>> runtut = new ArrayList<>(products);
        // Mengurutkan produk berdasarkan comparable
        Collections.sort((List) runtut);
        // Menampilkan produk yang sudah diurutkan
        for (Product<?> p : runtut) {
            System.out.println(p);
        }
    }

    // Menampilkan semua kategori produk yang unik dari set categories
    public void KategoriUnik() {
        for (String unik : categories) {
            System.out.println(unik);
        }
    }

    // Method untuk menambahkan produk ke dalam antrian yang sudah diproses
    public void TambahAntrianProduk(Product<?> product) {
        processedQueue.add(product);
    }

    // Method untuk menampilkan produk yang ada dalam antrian
    public void MenampilkanAntrianProduk() {
        System.out.printf("%-5s %-15s %-15s %-10s\n", "ID", "Name", "Category", "Price");
        for (Product<?> p : processedQueue) {
            System.out.println(p);
        }
    }

}
