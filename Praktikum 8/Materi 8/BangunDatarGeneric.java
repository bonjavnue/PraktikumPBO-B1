/**
 * File : BangunDatarGeneric.java
 * Nama : Tera Makna Pratiwi
 * NIM : 24060122140102
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 * 
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan ! */
/*public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}*/

/*Kesimpulannya adalah 'T' hanyalah konvensi penamaan untuk tipe parameter generik sehingga jika 'T' diganti ke karakter lain
seperti T1 maka tidak akan mengubah fungsi dari kelas generic. Tetapi yang perlu diperhatikan adalah konsistensi dari penggunaan nama tersebut*/
