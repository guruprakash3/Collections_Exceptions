import java.util.*;  
class LinkedHashSt
{  
 public static void main(String args[])
 {  
  LinkedHashSet<String> al=new LinkedHashSet<String>();  
  al.add("Madhu");  
  al.add("Guru");  
  al.add("Madhu");  
  al.add("Bharath");  
  al.add("Guru");  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  