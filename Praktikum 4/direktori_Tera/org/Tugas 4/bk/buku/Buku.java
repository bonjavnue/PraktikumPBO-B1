/**
 * File : Buku.java 03/22/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : representasi dasar dari objek buku
 */

 package bk.buku;

 public class Buku{
    private String judul;
    private String penulis;
    private String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public String getTahunTerbit(){
        return tahunTerbit;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void view(){
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
    }
 }