package com.mycompany.sistemmanajemenparkir;

import Kendaraan.Kendaraan;
import java.util.ArrayList;

/**
 * Class untuk mengelola area parkir.
 */
public class Parkir {

    private ArrayList<Kendaraan> daftarKendaraan;
    private int kapasitas;

    // Constructor
    public Parkir(int kapasitas) {
        this.kapasitas = kapasitas;
        this.daftarKendaraan = new ArrayList<>();
    }

    // =================================
    // MENAMBAHKAN KENDARAAN
    // =================================

    public void kendaraanMasuk(Kendaraan kendaraan) {

        // Condition if-else
        if (daftarKendaraan.size() >= kapasitas) {

            System.out.println();
            System.out.println("Parkiran sudah penuh!");

        } else if (cariKendaraan(kendaraan.getNomorPlat()) != null) {

            System.out.println();
            System.out.println(
                    "Kendaraan dengan nomor plat "
                    + kendaraan.getNomorPlat()
                    + " sudah berada di parkiran."
            );

        } else {

            daftarKendaraan.add(kendaraan);

            System.out.println();
            System.out.println(
                    "Kendaraan berhasil masuk parkiran."
            );
        }
    }

    // =================================
    // MENGELUARKAN KENDARAAN
    // =================================

    public void kendaraanKeluar(String nomorPlat) {

        Kendaraan kendaraan = cariKendaraan(nomorPlat);

        if (kendaraan == null) {

            System.out.println();
            System.out.println(
                    "Kendaraan dengan nomor plat "
                    + nomorPlat
                    + " tidak ditemukan."
            );

        } else {

            System.out.println();
            System.out.println("===================================");
            System.out.println("          STRUK PARKIR");
            System.out.println("===================================");

            kendaraan.tampilkanInfo();

            System.out.println();
            System.out.println(
                    "Total yang harus dibayar: Rp "
                    + kendaraan.hitungTarif()
            );

            System.out.println("===================================");

            daftarKendaraan.remove(kendaraan);

            System.out.println(
                    "Kendaraan berhasil keluar dari parkiran."
            );
        }
    }

    // =================================
    // MENCARI KENDARAAN
    // =================================

    public Kendaraan cariKendaraan(String nomorPlat) {

        for (Kendaraan kendaraan : daftarKendaraan) {

            if (kendaraan.getNomorPlat()
                    .equalsIgnoreCase(nomorPlat)) {

                return kendaraan;
            }
        }

        return null;
    }

    // =================================
    // MENAMPILKAN SEMUA KENDARAAN
    // =================================

    public void tampilkanSemuaKendaraan() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("      DAFTAR KENDARAAN PARKIR");
        System.out.println("===================================");

        if (daftarKendaraan.isEmpty()) {

            System.out.println(
                    "Belum ada kendaraan yang parkir."
            );

        } else {

            int nomor = 1;

            for (Kendaraan kendaraan : daftarKendaraan) {

                System.out.println();
                System.out.println(
                        "Kendaraan ke-" + nomor
                );

                kendaraan.tampilkanInfo();

                nomor++;
            }
        }
    }

    // =================================
    // MENAMPILKAN STATUS PARKIR
    // =================================

    public void tampilkanStatusParkir() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("          STATUS PARKIR");
        System.out.println("===================================");

        System.out.println(
                "Kapasitas       : " + kapasitas
        );

        System.out.println(
                "Kendaraan       : "
                + daftarKendaraan.size()
        );

        System.out.println(
                "Tempat Tersedia : "
                + (kapasitas - daftarKendaraan.size())
        );

        System.out.println("===================================");
    }
}