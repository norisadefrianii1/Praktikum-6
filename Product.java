package marketplace;

// Kelas Product yang merepresentasikan produk menggunakan Generic T agar fleksibel
public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    // Atribut dari produk
    private int id; // ID untuk produk
    private String name; // Nama produk
    private T category; // Kategori produk menggunakan generic
    private double price; // Harga produk

    // Konstruktor untuk membuat objek produk
    public Product(int id, String name, T category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter untuk mendapatkan nilai dari atribut produk
    public int getId() {
        return id;
    }

    // Getter untuk mendapatkan nama produk
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan kategori produk
    public T getCategory() {
        return category;
    }

    // Getter untuk mendapatkan harga produk
    public double getPrice() {
        return price;
    }

    // Method compareTo untuk membandingkan produk berdasarkan kategori
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category);
    }

    // Override toString untuk menampilkan informasi produk
    @Override
    public String toString() {
        return String.format("%-5d %-15s %-15s %-10.2f", id, name, category, price);
    }
}
