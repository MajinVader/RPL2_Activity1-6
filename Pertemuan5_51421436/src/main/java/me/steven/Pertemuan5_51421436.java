/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi
 */

package me.steven;

import me.steven.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Kelas utama untuk menjalankan aplikasi Spring Boot. 
 * Kelas ini mengimplementasikan CommandLineRunner, yang berarti 
 * akan menjalankan method `run()` setelah aplikasi diinisialisasi.
 * 
 * @author Steven Jordan
 */
@SpringBootApplication // Anotasi ini menandai kelas sebagai aplikasi Spring Boot
public class Pertemuan5_51421436 implements CommandLineRunner {
    // Dependency injection untuk menghubungkan MahasiswaController
    @Autowired
    private MahasiswaController mhsController;
    
    // Method main, titik masuk utama untuk menjalankan aplikasi
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_51421436.class, args);
    }
    
    // Method run yang akan dipanggil saat aplikasi dijalankan
    @Override
    public void run(String... args) throws Exception {
        // Menjalankan menu interaktif dari MahasiswaController
        mhsController.tampilkanMenu();
    }
}
