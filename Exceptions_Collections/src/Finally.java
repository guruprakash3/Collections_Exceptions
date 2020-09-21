class Finally
{  
  public static void main(String args[])
  {  
  try
  {  
   int data=87/0;  
   System.out.println(data);  
  }  
  catch(NullPointerException e)
  {
	  System.out.println(e);
	  }  
  finally
  {
	  System.out.println("finally block executes always");
	  }  
  System.out.println("Process the other code");  
  }  
}  