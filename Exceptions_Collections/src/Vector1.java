import java.util.*;  
public class Vector1 
{  
       public static void main(String args[]) 
       {  
          Vector<String> vec = new Vector<String>();  
          vec.add("Bangalore");  
          vec.add("Hyderabad");  
          vec.add("Chennai");  
          vec.add("Mumbai");  
          vec.addElement("Pune");  
          vec.addElement("Indore");  
          vec.addElement("Ranchi");  
            
          System.out.println("Elements are: "+vec);  
       }  
}  