package com.mycompany.activity2_51421436;
/**
 *
 * @author Steven Jordan
 */
public class Activity2_51421436 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Steven", "51421436", 21);
        mahasiswa.tampilkanData();
        System.out.println();
        
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Leonardo", "51421444", 22, "Teknik Informatika");
        mahasiswaSarjana.tampilkanData();
    }
}
