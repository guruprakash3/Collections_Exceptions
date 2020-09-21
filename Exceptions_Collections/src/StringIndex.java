class StringIndex
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            String a = "Welcome to all"; 
            char c = a.charAt(24);  
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) 
        { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
} 
