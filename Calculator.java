public class Calculator 
{
    public static void main(String[] args) 
    {
        Calculators.Addition(25, 555);
        Calculators.Subtraction(25, 5);
        Calculators.Multiplication(25, 5);
        Calculators.Division(25, 5);
    }
}

class Calculators
{
    
    public static void Addition(double a, double b)
    {
        System.out.println("The addition result is: "+(a+b));
    }

    public static void Subtraction(double a, double b)
    {

        System.out.println("The subtraction result is: "+(a-b));
    }

    public static void Multiplication(double a, double b)
    {
        System.out.println("The multiplication result is: "+(a*b));
    }

    public static void Division(double a, double b)
    {
        System.out.println("The division result is: "+(a/b));
    }
}
