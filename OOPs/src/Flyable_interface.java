
interface Flyab
{
	void  fly();

}
class bird implements Flyab
{
	public void fly()
	{
		System.out.println("with wings");
	}
}
class aeroplain implements Flyab
{
	public void fly()
	{
		System.out.println("with Feul");
	}
}
public class Flyable_interface
{
	public static void main(String[] args)
	{
		Flyab[] flyingobject= {new bird(),new aeroplain()};
		for(Flyab f:flyingobject)
		{
			f.fly();
		}
	}
}
