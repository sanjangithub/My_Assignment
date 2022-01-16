public class ReturnMethods 
{
    public static void main(String[] args) 
    {
        Methods m = new Methods();
        System.out.println(m.AddingNum(65161, 6535132));
        System.out.println(m.Concatnames("chikkala", "sanjan"));
        System.out.println(m.PrintChar('A'));
        System.out.println(m.Salary(20000));
        System.out.println(m.SubNum(32135135, 6543565));
    }
}

class Methods
{
    public int AddingNum(int a, int b)
    {
         return a+b;
    }

    public String Concatnames(String a, String b)
    {
        return a+" "+b+".";
    }

    public double Salary(double a)
    {
        return a;
    }

    public float SubNum(float a, float b)
    {
        return a-b;
    }

    public char PrintChar(char a)
    {
        return a;
    }
}