// Nama    : Tera Makna Pratiwi
// NIM     : 24060122140102
// Tanggal : 11 Maret 2024

public class BankAccount {
    // deklarasi atribut
    private float balance;

    // deklrasi konstruktor
    public BankAccount(){
        balance = 0;
    }

    // deklrasi overloading konstruktor
    public BankAccount(float initialBalance){
        balance = initialBalance;
    }

    // deklarasi metode
    public float deposit(float jumlah){
        balance = balance + jumlah;
        return jumlah;
    }

    public float withdraw(float jumlah){
        if (jumlah <= balance){
            balance -= jumlah;
        }
        return jumlah;
    }

    public float getBalance(){
        return balance;
    }

    






    
}
