package Kendaraan;

import Kendaraan.Kendaraan;

/**
 * Subclass Motor dari superclass Kendaraan.
 */
public class Motor extends Kendaraan {

    private String jenisMotor;

    // Constructor
    public Motor(
            String nomorPlat,
            String pemilik,
            int durasiParkir,
            String jenisMotor) {

        // Memanggil constructor superclass
        super(nomorPlat, pemilik, durasiParkir);

        this.jenisMotor = jenisMotor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    // Override method dari superclass
    @Override
    public int hitungTarif() {

        int tarifPerJam = 3000;

        return getDurasiParkir() * tarifPerJam;
    }

    // Override method dari superclass
    @Override
    public String getJenisKendaraan() {

        return "Motor";
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("-----------------------------------");
        System.out.println("          DATA MOTOR");
        System.out.println("-----------------------------------");

        super.tampilkanInfo();

        System.out.println("Jenis Motor    : " + jenisMotor);

        System.out.println("-----------------------------------");
    }
}
