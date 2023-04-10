package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class task extends Thread
{
	private int n;
	public task(int n)
	{
		this.n=n;		//System.out.println("Task "+n);
	
	}		
	
	public  void run(int n)
	{
		System.out.println("Task "+n);
		for(int i=n*10+1;i<=n*10+10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Task2 "+n+" Over");
	}
}
public class fixedthresdpool {

	public static void main(String[] args)  
	{
		ExecutorService ex=Executors.newFixedThreadPool(2);
		ex.execute(new task(1));
		ex.execute(new task(2));
		ex.execute(new task(3));
		ex.execute(new task(4));
		ex.shutdown();
	}
}
