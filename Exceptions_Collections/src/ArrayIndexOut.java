class ArrayIndexOut
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            int a[] = new int[5]; 
            a[8] = 14;
                       
        } 
        catch(ArrayIndexOutOfBoundsException e)
        { 
            System.out.println ("Array Index is Out Of Bounds"); 
        } 
    } 
} 