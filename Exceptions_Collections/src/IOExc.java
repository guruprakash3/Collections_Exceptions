import java.util.*; 
  
public class IOExc 
{ 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        String s = "hello world"; 
  
        Scanner scanner = new Scanner(s); 
  
        System.out.println("" + scanner.nextLine()); 
  
        System.out.println("" + scanner.ioException()); 
  
        scanner.close(); 
    } 
} 