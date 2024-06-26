/*
 * File : BangunDatarGenericTest.java
 * Nama : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());
    }
}