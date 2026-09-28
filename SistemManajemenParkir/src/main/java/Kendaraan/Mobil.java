package Kendaraan;

import Kendaraan.Kendaraan;

/**
 * Subclass Mobil dari superclass Kendaraan.
 */
public class Mobil extends Kendaraan {

    private String tipeMobil;

    // Constructor
    public Mobil(
            String nomorPlat,
            String pemilik,
            int durasiParkir,
            String tipeMobil) {

        // Memanggil constructor superclass
        super(nomorPlat, pemilik, durasiParkir);

        this.tipeMobil = tipeMobil;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    // Override method dari superclass
    @Override
    public int hitungTarif() {

        int tarifPerJam = 5000;

        return getDurasiParkir() * tarifPerJam;
    }

    // Override method dari superclass
    @Override
    public String getJenisKendaraan() {

        return "Mobil";
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("-----------------------------------");
        System.out.println("          DATA MOBIL");
        System.out.println("-----------------------------------");

        super.tampilkanInfo();

        System.out.println("Tipe Mobil     : " + tipeMobil);

        System.out.println("-----------------------------------");
    }
}