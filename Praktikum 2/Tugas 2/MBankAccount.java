// Nama    : Tera Makna Pratiwi
// NIM     : 24060122140102
// Tanggal : 11 Maret 2024

public class MBankAccount {
    public static void main(String[] args){
    
    BankAccount b = new BankAccount(1000);
    System.out.println("Saldo sebelum transaksi: "+ b.getBalance());
    
    System.out.println("Deposit sejumlah "+ b.deposit(500) + " berhasil. Saldo saat ini: " + b.getBalance());
    System.out.println("Penarikan sejumlah "+ b.withdraw(200) + " berhasil. Saldo saat ini: " + b.getBalance());
    System.out.println("Saldo setelah transaksi: "+ b.getBalance());
    }
    
}
