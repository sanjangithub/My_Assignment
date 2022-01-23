public class ThreadMain extends Thread
{
 	public void run()
 	{
  		System.out.println("Thread which is created started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadMain mt = new  ThreadMain();
  		mt.start();
 	}
}

