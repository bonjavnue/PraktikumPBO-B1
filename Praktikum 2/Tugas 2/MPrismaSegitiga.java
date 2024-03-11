// Nama    : Tera Makna Pratiwi
// NIM     : 24060122140102
// Tanggal : 11 Maret 2024

public class MPrismaSegitiga{
    public static void main(String[] args){
        Segitiga s = new Segitiga(3, 4);
        PrismaSegitiga p = new PrismaSegitiga(s, 5);

        System.out.println("Segitiga (" + s.getAlas() + "," + s.getTinggiSegitiga() + ")");
        
        double volume = p.hitungVolume();
        System.out.println("Hitung Volume: " + volume);

        double luasP = p.hitungLuasPermukaan();
        System.out.println("Hitung Luas Permukaan: " + luasP);
    }
}