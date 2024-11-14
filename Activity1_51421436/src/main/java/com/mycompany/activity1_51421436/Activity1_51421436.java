package com.mycompany.activity1_51421436;
import java.util.Scanner;
/**
 *
 * @author Steven Jordan
 */
public class Activity1_51421436 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan NPM anda: ");
        String npm = input.nextLine();
        
        System.out.println("Masukkan umur anda: ");
        int umur = input.nextInt();
        
        System.out.println("Nama anda adalah " + nama);
        System.out.println("NPM anda adalah " + npm);
        System.out.println("Umur anda adalah " + umur + " tahun");
    }
}
