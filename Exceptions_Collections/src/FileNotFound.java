import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
 class FileNotFound
 { 
  
    public static void main(String args[])  { 
        try { 
  
            File file = new File("E://file.txt"); 
  
            FileReader fr = new FileReader(file); 
        }
        catch (FileNotFoundException e)
        { 
           System.out.println("File do not exist"); 
        } 
    } 
} 