// File : Asersi2.java
// Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

//class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main (String[] args){
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol!!!"; 
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}

// Pada program ini terjadi hal yang kurang tepat karena inisiasi dari jari jari 0 yang mana akan menghasilkan keliling 0.
// jika keliling 0 maka tidak ada lingkaran jadi yang tepat inisiasi jari jari harus lebih dari 0