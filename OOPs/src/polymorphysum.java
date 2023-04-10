abstract class Animal
	 {
		 abstract void bark() ;
	 }
	 class dog extends Animal
	 {
		 public void bark()
		 {
			 System.out.println("Bow Bow");
		 }
		 
	 } 
	 class cat extends Animal
	 {
		 public void bark()
		 {
			 System.out.println("Meow Meow");
		 }
		 
	 }
public class polymorphysum 
{
	 
	public static void main(String[] args) 
	{
		Animal[] animal= {new cat(), new dog()};
		for(Animal animal1:animal)
		{
			animal1.bark();
		}
	}

}
