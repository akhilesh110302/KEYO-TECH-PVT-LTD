package practice;
//First method of implementing / creating thread
class task1 extends Thread
{
	public synchronized void run()
	{	
		System.out.println("Task1");
		//System.out.println("");	
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("Task1 Over");
	}
}  
//Secound method of implementing / creating thread
class task2 implements Runnable
{
	public synchronized void run()
	{
		System.out.println("Task2");
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Task2 Over");
	}
}
public class Threaddd {

	public static void main(String[] args) throws InterruptedException 
	{
		task1 t1=new task1();
		t1.start();
		
		//t1.sleep(5000);
		
		
		task2 t2=new task2();
		Thread td=new Thread(t2);
		td.start();
		
		// td.join();
		
		System.out.println("Task3");
		for(int i=21;i<=30;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("Task3 Over");
		System.out.println("Main Over");
	}

}
