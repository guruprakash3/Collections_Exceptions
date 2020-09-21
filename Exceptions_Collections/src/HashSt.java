import java.util.*;  
class HashSt
{  
 public static void main(String args[])
 {  
  HashSet<String> set=new HashSet<String>();  
  set.add("Bharath");  
  set.add("Aravind");  
  set.add("Madhu");  
  set.add("Ravi");  
  set.add("Guru");
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  