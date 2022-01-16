public class AccessModifierPrivate 
{
    public static void main(String[] args) 
    {
        ABC s = new ABC();
        s.message(); //This is a default method, because we didn't specify any access modifier to this.
        // System.out.println(s.a); // we can not access int a. Because it is declared as private.
    }
}

class ABC
{
    private int a =225; // 'a' can be accessed only within this class. And we can't if the class is private.
    void message()
    {
        System.out.println("This is an ABC class message.");
        System.out.println(a);
    }
}
