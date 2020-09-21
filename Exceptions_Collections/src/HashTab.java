import java.util.*;  
public class HashTab 
{  
   public static void main(String args[]) 
   {  
  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
     map.put(100,"Aravind");    
     map.put(102,"Guru");   
     map.put(101,"Bharath");    
     map.put(103,"Ravi"); 
     map.put(103,"Madhu"); 
     System.out.println("Before remove: "+ map);    
       map.remove(102);  
       System.out.println("After remove: "+ map);  
   }      
}  