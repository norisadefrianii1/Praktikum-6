package marketplace;

public class Marketplace {
    public static void main(String[] args) {
        // Membuat objek pm (ProductManager) untuk mengelola produk
        ProductManager pm = new ProductManager();

        // Membuat beberapa produk dengan kategori yang berbeda
        // Produk 1 dengan kategori cemilan
        Product<String> cemilan1 = new Product<>(1, "Risol Mayo", "Cemilan", 4000);
        // Produk 2 dengan kategori cemilan
        Product<String> cemilan2 = new Product<>(2, "Pisang Coklat", "Cemilan", 3000);
        // Produk 3 dengan kategori makanan berat
        Product<String> makananBerat1 = new Product<>(3, "Nasi Padang", "Makanan Berat", 15000);

        // Menambahkan semua produk ke dalam list produk
        pm.TambahProduk(cemilan1);
        pm.TambahProduk(cemilan2);
        pm.TambahProduk(makananBerat1);

        // Menampilkan semua produk yang telah ditambahkan dan diurutkan berdasarkan
        // kategori
        System.out.println("\n=== Daftar Produk Berdasarkan Kategori ===");
        pm.MenampilkanProduk();

        // Menampilkan daftar kategori unik yang ada dari semua produk
        System.out.println("\n=== Kategori Unik Produk ===");
        pm.KategoriUnik();

        // Menambahkan 2 produk ke dalam antrian proses
        pm.TambahAntrianProduk(cemilan1);
        pm.TambahAntrianProduk(makananBerat1);

        // Menampilkan antrian produk yang sudah diproses
        System.out.println("\n=== Antrian Produk yang telah Diproses ===");
        pm.MenampilkanAntrianProduk();

        // Mencari produk berdasarkan nama dan kategori
        System.out.println("\n=== Mencari Produk berdasarkan Nama dan Kategori ===");
        pm.CariProduk("Pisang Coklat", "Cemilan");

        // Menghapus produk berdasarkan ID (ID 2 adalah pisang coklat dengan kategori
        // cemilan)
        pm.HapusProdukbyID(2);

        // Menampilkan ulang daftar produk setelah penghapusan
        System.out.println("\n=== Setelah Produk ID 2 Dihapus ===");
        pm.MenampilkanProduk();

        // Menampilkan ringkasan produk berupa jumlah dan total harga
        System.out.println("\n=== Informasi Produk ===");
        FiturBaru.TampilkanRingkasan(pm);
    }
}