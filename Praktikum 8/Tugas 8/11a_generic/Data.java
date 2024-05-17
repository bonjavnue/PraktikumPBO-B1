/*Nama File : Data.java
 * Nama : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : kelas konstruksi generic untuk kupu-kupu
 */

 public class Data <T extends Kupu> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}
