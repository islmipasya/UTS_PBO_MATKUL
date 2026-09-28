package com.mycompany.sistemmanajemenparkir;

import Kendaraan.Motor;
import Kendaraan.Mobil;
import java.util.Scanner;

/**
 * Main class untuk menjalankan Sistem Manajemen Parkir.
 */
public class SistemManajemenParkir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Parkir parkir = new Parkir(10);

        int pilihan;

        do {

            tampilkanMenu();

            System.out.print("Pilih menu: ");

            try {

                pilihan = input.nextInt();
                input.nextLine();

            } catch (Exception e) {

                System.out.println();
                System.out.println(
                        "Input harus berupa angka!"
                );

                input.nextLine();

                pilihan = 0;
            }

            switch (pilihan) {

                case 1:
                    tambahMobil(input, parkir);
                    break;

                case 2:
                    tambahMotor(input, parkir);
                    break;

                case 3:
                    keluarkanKendaraan(input, parkir);
                    break;

                case 4:
                    parkir.tampilkanSemuaKendaraan();
                    break;

                case 5:
                    parkir.tampilkanStatusParkir();
                    break;

                case 6:
                    System.out.println();
                    System.out.println(
                            "Terima kasih telah menggunakan "
                            + "Sistem Manajemen Parkir."
                    );
                    break;

                default:
                    System.out.println();
                    System.out.println(
                            "Menu tidak tersedia!"
                    );
            }

        } while (pilihan != 6);

        input.close();
    }

    // ================================
    // MENU
    // ================================

    public static void tampilkanMenu() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("    SISTEM MANAJEMEN PARKIR");
        System.out.println("===================================");
        System.out.println("1. Parkir Mobil");
        System.out.println("2. Parkir Motor");
        System.out.println("3. Kendaraan Keluar");
        System.out.println("4. Lihat Kendaraan");
        System.out.println("5. Status Parkir");
        System.out.println("6. Keluar");
        System.out.println("===================================");
    }

    // ================================
    // TAMBAH MOBIL
    // ================================

    public static void tambahMobil(
            Scanner input,
            Parkir parkir) {

        System.out.println();
        System.out.println("===================================");
        System.out.println("           PARKIR MOBIL");
        System.out.println("===================================");

        System.out.print("Nomor Plat : ");
        String nomorPlat = input.nextLine();

        System.out.print("Nama Pemilik : ");
        String pemilik = input.nextLine();

        System.out.print("Durasi Parkir (jam): ");
        int durasi = input.nextInt();
        input.nextLine();

        System.out.print("Tipe Mobil : ");
        String tipeMobil = input.nextLine();

        Mobil mobil = new Mobil(
                nomorPlat,
                pemilik,
                durasi,
                tipeMobil
        );

        parkir.kendaraanMasuk(mobil);
    }

    // ================================
    // TAMBAH MOTOR
    // ================================

    public static void tambahMotor(
            Scanner input,
            Parkir parkir) {

        System.out.println();
        System.out.println("===================================");
        System.out.println("           PARKIR MOTOR");
        System.out.println("===================================");

        System.out.print("Nomor Plat : ");
        String nomorPlat = input.nextLine();

        System.out.print("Nama Pemilik : ");
        String pemilik = input.nextLine();

        System.out.print("Durasi Parkir (jam): ");
        int durasi = input.nextInt();
        input.nextLine();

        System.out.print("Jenis Motor : ");
        String jenisMotor = input.nextLine();

        Motor motor = new Motor(
                nomorPlat,
                pemilik,
                durasi,
                jenisMotor
        );

        parkir.kendaraanMasuk(motor);
    }

    // ================================
    // KENDARAAN KELUAR
    // ================================

    public static void keluarkanKendaraan(
            Scanner input,
            Parkir parkir) {

        System.out.println();
        System.out.println("===================================");
        System.out.println("         KENDARAAN KELUAR");
        System.out.println("===================================");

        System.out.print("Nomor Plat: ");

        String nomorPlat = input.nextLine();

        parkir.kendaraanKeluar(nomorPlat);
    }
}