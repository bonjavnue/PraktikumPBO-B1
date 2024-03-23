/**
 * File : bukuAkademik.java 03/22/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : representasi dari objek buku akademik, turunan kelas buku non fiksi
 */
package bk.bukunonFiksi;

public class bukuAkademik extends bukuNonFiksi{
    public bukuAkademik(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
    }
    
}
