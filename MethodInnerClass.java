public class MethodInnerClass 
{
    public static void main(String[] args) 
    {
        Outer o = new Outer();
        o.MyOutermethod(); // calling outer class method
        Outer.Inner i = o.new Inner();
        i.MyInnermethod(); // calling inner class method
        Outer mynewouter = new Outer()
        {
            @Override
            void MyOutermethod() 
            {
                System.out.println("This is from annonymous outer sub class.");
            }
        };
        mynewouter.MyOutermethod();

        Outer.Inner mynewinner = o.new Inner()
        {
            @Override
            void MyInnermethod() 
            {
                System.out.println("This is from annonymous inner sub class.");
            }
        };
        mynewinner.MyInnermethod();
    }
}

class Outer // outer class
{
    void MyOutermethod()
    {
        System.out.println("This is from outer class.");
    }

    class Inner // nested class
    {
        void MyInnermethod() //  nested method
        {
            System.out.println("This is from inner class.");
        }
    }
}
