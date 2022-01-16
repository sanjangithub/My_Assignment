package MyPackage;
import pack.*;

class B
{
    public static void main(String[] args) 
    {
        A obj = new A(); // Error will be generated. 
        obj.p;// compile time error.

    }
}
