package practice;

public class incredecre 
{
    public static void main(String args[]) 
    {    
         int a = 1;
         int b = 2;
         int c;
         int d;
         c = ++b;
         System.out.println(c);
         System.out.println(b);
         d = a++;
         System.out.println(d);
         c++;
        
         System.out.println(c);
         b++;
        
         System.out.println(b);
         
         ++a;
         System.out.println(a + " " + b + " " + c);
    } 
}