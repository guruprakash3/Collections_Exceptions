import java.util.*;  
class TreeSt
{  
 public static void main(String args[])
 {  
 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(43);  
         set.add(81);  
         set.add(36);  
         set.add(68);  
         System.out.println("Lowest Value: "+set.pollFirst());  
         System.out.println("Highest Value: "+set.pollLast());  
 }  
}  