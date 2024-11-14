package com.mycompany.activity2_51421436;

/**
 *
 * @author Steven Jordan
 */
public class MahasiswaSarjana extends Mahasiswa {
    private String jurusan;
    
    public MahasiswaSarjana(String nama, String npm, int umur, String jurusan){
        super(nama, npm, umur);
        this.jurusan = jurusan;
    }
    
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jurusan: " + jurusan);
    }
}