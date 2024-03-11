// Nama    : Tera Makna Pratiwi
// NIM     : 24060122140102
// Tanggal : 11 Maret 2024

public class Segitiga{
    // deklrasi atribut
    private double alas;
    private double tinggi;

    // deklrasasi konstruktor
    public Segitiga(){
        alas = 0;
        tinggi = 0;
    }

    // deklarasi overloading konstruktor
    public Segitiga(double a, double t){
        alas = a;
        tinggi = t;
    }

    // deklrasi metode
    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        double luas = (alas*tinggi)/2;
        return luas;
    }
}
