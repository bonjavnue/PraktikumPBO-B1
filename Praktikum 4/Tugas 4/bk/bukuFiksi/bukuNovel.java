/**
 * File : bukuNovel.java 03/22/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : representasi dari objek buku novel, turunan kelas buku fiksi
 */

package bk.bukuFiksi;

public class bukuNovel extends bukuFiksi {
    public bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
}
