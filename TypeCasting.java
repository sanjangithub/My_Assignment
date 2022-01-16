public class TypeCasting 
{
     public static void main(String[] args) 
     {
         System.out.println("Implicit Method: ");
         char a ='F';
         System.out.println("The value of a is: "+a);
         int b=a;
         System.out.println(b);
         float c=a;
         System.out.println(c);
         double d=a;
         System.out.println(d);
         System.out.println("\n");

         System.out.println("Explicit Method: ");
         double x=465.55;
         int y = (int)x;
         System.out.println("value of x: "+x);
         System.out.println("value of y: "+y);

     }    
}
