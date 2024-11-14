/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package me.steven.repository;

import me.steven.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface ini berfungsi sebagai jembatan antara aplikasi dan database untuk entitas Mahasiswa.
 * Dengan menggunakan JpaRepository, kita secara otomatis mendapat berbagai fungsi penting seperti
 * menambah, menghapus, memperbarui, dan mengambil data tanpa harus menulis kode tambahan.
 * 
 * @author Steven Jordan
 */
@Repository // Memberitahu Spring bahwa ini adalah kelas repository untuk mengelola data
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {
    // Dengan mewarisi JpaRepository, kita sudah mendapatkan semua method standar untuk CRUD.
    // Tidak perlu menulis method-method manual, karena sudah diurus oleh Spring Data JPA.
}
