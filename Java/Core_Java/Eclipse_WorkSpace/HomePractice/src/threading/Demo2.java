package threading;

public class Demo2 implements Runnable
{

	public void run()
	{
		System.out.println("Printing 51 to 55");
		for(int i =51;i<=60;i++)
		{
			System.out.println("i = "+i);
			try{
				Thread.sleep(1500);
				}
				catch(Exception e)
				{
					System.out.println("Handling Exception");
				}
		}
		
	}
	
	
	
	
}
