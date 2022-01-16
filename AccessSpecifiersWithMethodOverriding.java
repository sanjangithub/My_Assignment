class A
{  
    protected void msg()
    {
        System.out.println("Hello java");
    }

}  
      
    public class AccessSpecifiersWithMethodOverriding extends A
    {  
       void msg() // The default access specifier is more restrictive than the protected. So it generates compile time error.
       {
           System.out.println("Hello java");
       }

       public static void main(String[] args) 
       {
           AccessSpecifiersWithMethodOverriding asmo = new AccessSpecifiersWithMethodOverriding();
           asmo.msg();
       }
    }  
