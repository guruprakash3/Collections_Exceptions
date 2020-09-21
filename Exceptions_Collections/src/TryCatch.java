public class TryCatch
{  
  
    public static void main(String[] args)
    {  
        try  
        {  
        int data=56/0;   
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Process the other code");  
    }  
      
}  