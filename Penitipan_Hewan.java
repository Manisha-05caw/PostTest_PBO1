/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package penitipan_hewan;

/**
 *
 * @author Personal
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Penitipan_Hewan {
    // Class untuk data Hewan
    static class Hewan {
        String nama;
        String jenis;
        int umur;

        Hewan(String nama, String jenis, int umur) {
            this.nama = nama;
            this.jenis = jenis;
            this.umur = umur;
        }

        @Override
        public String toString() {
            return "Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hewan> daftarHewan = new ArrayList<>();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== Sistem Tempat Penitipan Hewan ===");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Daftar Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Hapus Hewan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nama hewan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jenis hewan: ");
                    String jenis = scanner.nextLine();
                    System.out.print("Masukkan umur hewan: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();
                    daftarHewan.add(new Hewan(nama, jenis, umur));
                    System.out.println("✅ Hewan berhasil ditambahkan!");
                }

                case 2 -> {
                    System.out.println("\n📋 Daftar Hewan yang Dititipkan:");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada hewan yang dititipkan.");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarHewan.get(i));
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Masukkan nomor hewan yang akan diubah: ");
                    int indexUbah = scanner.nextInt();
                    scanner.nextLine();
                    if (indexUbah > 0 && indexUbah <= daftarHewan.size()) {
                        Hewan hewanUbah = daftarHewan.get(indexUbah - 1);
                        System.out.print("Nama baru (" + hewanUbah.nama + "): ");
                        hewanUbah.nama = scanner.nextLine();
                        System.out.print("Jenis baru (" + hewanUbah.jenis + "): ");
                        hewanUbah.jenis = scanner.nextLine();
                        System.out.print("Umur baru (" + hewanUbah.umur + "): ");
                        hewanUbah.umur = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("✅ Data berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }

                case 4 -> {
                    System.out.print("Masukkan nomor hewan yang akan dihapus: ");
                    int indexHapus = scanner.nextInt();
                    scanner.nextLine();
                    if (indexHapus > 0 && indexHapus <= daftarHewan.size()) {
                        daftarHewan.remove(indexHapus - 1);
                        System.out.println("✅ Data hewan berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }

                case 5 -> {
                    jalan = false;
                    System.out.println("👋 Terima kasih telah menggunakan sistem penitipan hewan!");
                }

                default -> System.out.println("Pilihan tidak tersedia.");
            }
        }
        scanner.close();
    }
}
