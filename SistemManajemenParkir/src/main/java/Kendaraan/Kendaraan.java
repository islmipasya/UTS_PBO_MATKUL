package Kendaraan;

/**
// Superclass untuk semua jenis kendaraan.
 */
public abstract class Kendaraan {

    // Atribut
    private String nomorPlat;
    private String pemilik;
    private int durasiParkir;

    // Constructor
    public Kendaraan(String nomorPlat, String pemilik, int durasiParkir) {
        this.nomorPlat = nomorPlat;
        this.pemilik = pemilik;
        this.durasiParkir = durasiParkir;
    }

    // Getter nomor plat
    public String getNomorPlat() {
        return nomorPlat;
    }

    // Getter pemilik
    public String getPemilik() {
        return pemilik;
    }

    // Getter durasi
    public int getDurasiParkir() {
        return durasiParkir;
    }

    // Setter durasi
    public void setDurasiParkir(int durasiParkir) {
        this.durasiParkir = durasiParkir;
    }

    // Method abstrak
    // Akan diimplementasikan oleh subclass
    public abstract int hitungTarif();

    // Method abstrak untuk mendapatkan jenis kendaraan
    public abstract String getJenisKendaraan();

    // Menampilkan informasi kendaraan
    public void tampilkanInfo() {

        System.out.println("Nomor Plat     : " + nomorPlat);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Kendaraan: " + getJenisKendaraan());
        System.out.println("Durasi Parkir  : " + durasiParkir + " jam");
        System.out.println("Tarif Parkir   : Rp " + hitungTarif());
    }
}