public class SigleDimensionalArray 
{
    public static void main(String[] args) 
    {
        String [] cars = {"ferari","volks wegan","BMW","lamborgini","audi"};
        int [] prime = {2,3,5,7,11,13,17,19};
        System.out.println("The length of the cars Array is: "+cars.length);
        // System.out.println(cars[0]);
        // System.out.println(cars[1]);
        // System.out.println(cars[2]);
        // System.out.println(cars[3]);
        // System.out.println(cars[5]);
        for(String i : cars)
        {
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("The length of the prime array is :"+prime.length);

        for(int j : prime)

        {
            System.out.println(j);
        }

    }

}
    
