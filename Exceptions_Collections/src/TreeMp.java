import java.util.*;  
public class TreeMp
{  
   public static void main(String args[]) 
   {  
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Guru");    
      map.put(102,"Madhu");    
      map.put(101,"Ashok");    
      map.put(103,"Ramu");   
      map.put(103,"Bharath");  
      System.out.println("Before invoking remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      map.remove(102);      
      System.out.println("After invoking remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      }  
}  