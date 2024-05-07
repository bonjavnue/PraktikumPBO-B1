/**
 * File : KontrolSenjata.java 05/07/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata (Senjata s){
        this.senjata = s;
    }

    public boolean isiAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        if(jumPeluru>0){
            System.out.println("Peluru berhasil ditambah : "+jumPeluru);
        }

        senjata.setPeluru(senjata.getPeluru()+jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(!isiAdaPeluru()){
            System.out.println("Peluru Habis");
        }
        else{
            for(int i=0;i<jumlah;i++){

                if(isiAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    isiPeluru(-1);
                }
                else{
                    System.out.println("Gagal Tembak,Peluru Habis");
                }
            }   
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }

    public String menusuk(){
        return senjata.getBunyi();
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}