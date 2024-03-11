// Nama    : Tera Makna Pratiwi
// NIM     : 24060122140102
// Tanggal : 11 Maret 2024

public class PrismaSegitiga {
    // deklarasi atribut
    private Segitiga alas;
    private double tinggiPrisma;

    // deklarasi konstruktor
    public PrismaSegitiga(){
        tinggiPrisma = 0;
        alas = new Segitiga();
    }

    // deklarasi overloading konstruktor
    public PrismaSegitiga(Segitiga ap, double tp){
        tinggiPrisma = tp;
        alas = ap;
    }
    
    public double hitungVolume(){
        double volume = alas.hitungLuas()*tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan(){
        double luasP = ((2*alas.hitungLuas()) + (3*alas.getAlas()*tinggiPrisma));
        return luasP;
    }
}
