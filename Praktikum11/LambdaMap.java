import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args){
        Map<String, String> dataMhs = new HashMap<>();
        dataMhs.put("24060122140102", "Tera Makna Pratiwi");
        dataMhs.put("24060122130082", "Fathia Rahma"); 
        dataMhs.put("24060122130077", "Sunghoon"); 
        
        dataMhs.forEach((NIM, nama) -> System.out.println("NIM: " + NIM + " Nama: " + nama));
            
    }
}
    

