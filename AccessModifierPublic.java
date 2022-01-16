public class AccessModifierPublic 
{
    public static void main(String[] args) 
    {
        Publicdemo pd = new Publicdemo();
        pd.printmethod();
        mymmsg();
    }

    public static void mymmsg()
    {
        System.out.println("EXCECUTION COMPLETED.");
    }
}

class Publicdemo
{
    public int a = 3535365;
    public char c='H';
    public double d = 231.565;
    public String s = "JAVA LANGUAGE";

    void printmethod()
    {
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }

}