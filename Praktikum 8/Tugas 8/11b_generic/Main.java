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
        
        Kepompong K2 = new Kepompong();
        Data <Kepompong> anu2 = new Data<>();
        anu2.setIsi(K2);
        anu2.getIsi().gerak();

        KupuDewasa K3 = new KupuDewasa();
        Data <KupuDewasa> anu3 = new Data<>();
        anu3.setIsi(K3);
        anu3.getIsi().gerak();
    
        
    }
    
}
