public class AnnonymousInnerClass 
{
    public static void main(String[] args) 
    {
       AnimalPig ap = new AnimalPig();
       ap.Sound();
       AnimalPig godzilla = new AnimalPig() //godzilla is the inner class created annonumously inside the animal class
       {
           @Override
           void Sound() // overriding the method of the animal class
           {
               System.out.println("The godzilla says: bwaarhrhrhheharraea");
           }
       };
       godzilla.Sound();
       
    }
}

