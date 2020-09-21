import java.util.*;  
class LinkedHshMp
{  
 public static void main(String args[])
 {  
   LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
      map.put(100,"Madhu");    
     map.put(101,"Aravind");    
     map.put(102,"Guru");    
       System.out.println("Keys: "+map.keySet());  
       System.out.println("Values: "+map.values());  
       System.out.println("Key-Value pairs: "+map.entrySet());  
 }  
}  