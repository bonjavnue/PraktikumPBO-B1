/**
 * File : MapTest.java
 * Nama : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * 
 */

import java.util.*;

public class MapTest {
    public static void main (String[] args){
        //kunci --> integer, nilai --> String
        Map <Integer,String> map = new HashMap<Integer, String>();
        //menempatkan elemen kunci dan nilai
        map.put(1,"satu");
        map.put(2, "dua");
        //menempatkan elemen pertama
        System.out.println(map.get(1));
        
        //mengambil keseluruhan kunci sebagai objek colllection Set
        
        //bagaimana iterasi untuk mengambil keseluruhan
        //nilai dari kunci ? tulis pada laporan
        //petunjuk : gunakan iterasi seperti program ArrayListTest
        Set<Integer> key = map.keySet();
        // iterasi untuk mengambil keseluruhan nilai dari kunci
        for(Integer k : key){
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        }
    }

}
