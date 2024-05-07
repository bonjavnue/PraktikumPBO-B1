/**
 * File : Senjata.java 05/07/2024
 * Penulis : Tera Makna Pratiwi
 * NIM : 24060122140102
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public boolean isiMenusuk(){
        return menusuk;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
}

