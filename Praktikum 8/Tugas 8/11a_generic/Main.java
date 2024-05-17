/*Nama File : Main.java
 * Nama : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : kelas main untuk generic kupu-kupu
 */

 public class Main {
    public static void main(String[] args){
        Ulat K = new Ulat();
        Data <Ulat> anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    } 
}

