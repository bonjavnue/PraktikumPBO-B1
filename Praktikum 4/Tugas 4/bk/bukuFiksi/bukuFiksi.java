/**
 * File : bukuFiksi.java 03/22/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : representasi dari objek buku fiksi, turunan kelas buku
 */

package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku{
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre(){
        return genre;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setGenre(String genre){
        this.genre =genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Genre: " + getGenre());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
        System.out.println("Harga: " + getHarga());
    }
    
}
