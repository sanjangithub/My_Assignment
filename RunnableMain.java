public class RunnableMain implements Runnable
{
 
    public static int myCount = 0;
    public RunnableMain()
    {
         
    }
    public void run() 
    {
        while(RunnableMain.myCount <= 10)
        {
            try{
                System.out.println("Expl Thread: "+(++RunnableMain.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[])
    {
        System.out.println("Starting Main Thread...");
        RunnableMain mrt = new RunnableMain();
        Thread t = new Thread(mrt);
        t.start();
        while(RunnableMain.myCount <= 10)
        {
            try
            {
                System.out.println("Main Thread: "+(++RunnableMain.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

