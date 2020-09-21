import java.util.*;  
public class LinkedLst
{  
 public static void main(String args[])
 {  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Aravind");  
  al.add("Guru");  
  al.add("Aravind");  
  al.add("Bharath");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  