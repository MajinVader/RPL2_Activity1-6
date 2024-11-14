/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package me.steven.model;

import jakarta.persistence.*;

/**
 * Kelas ini merepresentasikan data mahasiswa yang akan disimpan di tabel "mahasiswa" dalam database.
 * Anotasi JPA digunakan untuk menghubungkan kelas ini dengan tabel tersebut.
 * 
 * @author Steven Jordan
 */
@Entity
@Table(name = "mahasiswa")
public class ModelMahasiswa {
    
    // ID mahasiswa sebagai primary key yang di-generate otomatis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    // NPM mahasiswa, wajib diisi dan panjang maksimum 8 karakter
    @Column(name = "npm", nullable = false, length = 8)
    private String npm;
    
    // Nama mahasiswa, wajib diisi dan panjang maksimum 50 karakter
    @Column(name = "nama", nullable = false, length = 50)
    private String nama;
    
    // Semester mahasiswa
    @Column(name = "semester")
    private int semester;
    
    // IPK (Indeks Prestasi Kumulatif) mahasiswa
    @Column(name = "ipk")
    private float ipk;
    
    // Konstruktor tanpa parameter, diperlukan oleh JPA
    public ModelMahasiswa() {
    }

    // Konstruktor dengan parameter untuk memudahkan pembuatan objek baru
    public ModelMahasiswa(int id, String npm, String nama, int semester, Float ipk) {
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }

    // Getter dan setter untuk ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan setter untuk NPM
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter dan setter untuk IPK
    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa dalam bentuk string
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", npm='" + npm + '\'' +
                ", nama='" + nama + '\'' +
                ", semester=" + semester +
                ", ipk=" + ipk +
                '}';
    }
}
