/**
 * File : BangunDatar.java 03/19/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 */
public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = 1;
    }

    public double getLuas(){
        return luas;
    }
}