import java.util.*;  
public class HashMp
{  
 public static void main(String args[])
 {  
   HashMap<Integer,String> map=new HashMap<Integer,String>();   
   map.put(1,"Bangalore");  
   map.put(2,"Chennai");    
   map.put(3,"Hyderabad");   
   map.put(4,"Kolkata");
   map.put(5,"Mumbai");
       
   System.out.println("Iterating Hashmap");  
   for(Map.Entry m : map.entrySet())
   {    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  