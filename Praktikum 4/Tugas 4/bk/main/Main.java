/**
 * File : Main.java 03/22/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : driver class untuk buku, buku fiksi, buku novel, buku non fiksi, dan buku akademik
 */

 package bk.main;

 import bk.buku.Buku;
 import bk.bukuFiksi.*;
 import bk.bukunonFiksi.*;

 public class Main{
    public static void main(String[] args){

        //Inisialisasi buku
        Buku buku1 = new Buku("Lucid Dream", "Ziggy","2013");
        Buku buku2 = new Buku("Hetty Feather", "Jacqueline Wilson", "2009");

        //Inisialisasi buku fiksi
        bukuFiksi komik = new bukuFiksi("Doraemon", "Fujiko.F.Fujio", "2013", "Komedi", 188, 25000);
        bukuNovel novel = new bukuNovel("Bumi", "Tere Liye", "2014", "Fantasy", 440, 103000);

        //Inisialisasi buku non fiksi
        bukuNonFiksi nonfiksi = new bukuNonFiksi("How To Respect Myself", "Yoon Hong Gyun", "2020", "Pengembangan Diri", 340, 88000);
        bukuAkademik akademik = new bukuAkademik("Pengantar Statistika", "Ronald E.Waipoie", "1993", "Statistika", 515, 26000);


        System.out.println("***************************[INFORMASI BUKU]**********************************");
        System.out.println("--------------------------------BUKU 1---------------------------------------");
        buku1.view();
        System.out.println("--------------------------------BUKU 2---------------------------------------");
        buku2.view();
        System.out.println();

        System.out.println("************************[INFORMASI BUKU FIKSI]*******************************");
        System.out.println("---------------------------------KOMIK---------------------------------------");
        komik.view();
        System.out.println("---------------------------------NOVEL---------------------------------------");
        novel.view();
        System.out.println();

        System.out.println("**********************[INFORMASI BUKU NON FIKSI]*****************************");
        System.out.println("-------------------------------NON FIKSI-------------------------------------");
        nonfiksi.view();
        System.out.println("--------------------------------AKADEMIK-------------------------------------");
        akademik.view();
        System.out.println();

    }
 }