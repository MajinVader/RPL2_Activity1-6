/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.steven.controller;

import me.steven.model.ModelMahasiswa;
import me.steven.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Steven Jordan
 */
@Controller
public class MahasiswaController {
    // Dependency injection untuk MahasiswaRepository
    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    // Method untuk menampilkan menu interaktif di console
    public void tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        int opsi;

        do {
            // Menampilkan opsi menu ke pengguna
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua mahasiswa");
            System.out.println("2. Tambah mahasiswa baru");
            System.out.println("3. Cek koneksi database");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            opsi = scanner.nextInt();
            scanner.nextLine(); // Menangkap newline setelah input angka

            // Switch case untuk menangani pilihan pengguna
            switch (opsi) {
                case 1:
                    // Memanggil method untuk menampilkan semua data mahasiswa
                    tampilkanSemuaMahasiswa();
                    break;
                case 2:
                    // Memanggil method untuk menambahkan data mahasiswa baru
                    tambahMahasiswa(scanner);
                    break;
                case 3:
                    // Memanggil method untuk mengecek koneksi ke database
                    cekKoneksi();
                    break;
                case 4:
                    // Keluar dari program
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    // Menangani input yang tidak valid
                    System.out.println("Opsi tidak valid, coba lagi.");
            }

        } while (opsi != 4); // Looping sampai pengguna memilih opsi keluar
    }

    // Method untuk menampilkan semua data mahasiswa
    private void tampilkanSemuaMahasiswa() {
        // Mengambil semua data mahasiswa dari repository
        List<ModelMahasiswa> mahasiswaList = mahasiswaRepository.findAll();
        if (mahasiswaList.isEmpty()) {
            // Menampilkan pesan jika tidak ada data
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            // Menampilkan data mahasiswa
            mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa));
        }
    }

    // Method untuk menambahkan data mahasiswa baru
    private void tambahMahasiswa(Scanner scanner) {
        // Meminta input dari pengguna untuk data mahasiswa
        System.out.print("Masukkan NPM : ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Semester : ");
        int semester = scanner.nextInt();
        System.out.print("Masukkan IPK : ");
        float ipk = scanner.nextFloat();

        // Membuat objek ModelMahasiswa baru
        ModelMahasiswa mahasiswa = new ModelMahasiswa(0, npm, nama, semester, ipk);
        // Menyimpan data mahasiswa ke database
        mahasiswaRepository.save(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    // Method untuk mengecek koneksi ke database
    private void cekKoneksi() {
        try {
            // Mencoba mengambil data mahasiswa untuk memastikan koneksi
            mahasiswaRepository.findAll();
            System.out.println("Koneksi ke database berhasil.");
        } catch (Exception e) {
            // Menampilkan pesan jika koneksi gagal
            System.out.println("Gagal terhubung ke database.");
        }
    }
}
