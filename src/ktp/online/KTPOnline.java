/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp.online;

import java.util.Scanner;

/**
 *
 * @author SENJU
 */
public class KTPOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nik,nama, alamat,ttl;
        char jenis_kelamin, gol_d;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan NIK : ");
        nik = input.next();
        
        System.out.print("Masukkan NAMA : ");
        nama = input.next();
        
        System.out.print("Masukkan ALAMAT : ");
        alamat = input.next();
        
        System.out.print("Masukkan GOL. DARAH : ");
        gol_d = input.next().charAt(0);
        
        System.out.print("Masukkan JENIS KELAMIN (L/P) : ");
        jenis_kelamin = input.next().charAt(0);
        
        System.out.print("Masukkan Tempat Tanggal Lahir : ");
        ttl = input.next();
        
        
    }
    
}
