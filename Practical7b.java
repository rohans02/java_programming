import java.util.HashMap;

public class Practical7b {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
    map.put("Vishwajeet", 17); 
    map.put("Rohan", 19); 
    map.put("Yash", 18); 
    map.put("Bhavesh", 17); 
      
    System.out.println("HashMap Contents:"); 

    for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) { 

      String key = entry.getKey(); 
      int value = entry.getValue(); 
      System.out.println(key + " : " + value); 
      }
    }
}
