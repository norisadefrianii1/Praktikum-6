package marketplace;

public class FiturBaru {

    // Method untuk menampilkan ringkasan dari daftar produk
    public static void TampilkanRingkasan(ProductManager pm) {

        // Menghitung jumlah total produk yang ada
        int jumlahProduk = pm.products.size();

        // Menampung total harga dari semua produk dengan nilai awal adalah 0
        double totalHarga = 0;

        // Menghitung total harga dari semua produk yang ada dalam daftar
        for (Product<?> produk : pm.products) {
            totalHarga += produk.getPrice();
        }

        // Menampilkan ringkasan produk
        System.out.printf("%-20s : %d\n", "Jumlah Produk", jumlahProduk); // Menampilkan jumlah produk
        System.out.printf("%-20s : %.2f\n", "Total Harga", totalHarga); // Menampilkan total harga

    }
}