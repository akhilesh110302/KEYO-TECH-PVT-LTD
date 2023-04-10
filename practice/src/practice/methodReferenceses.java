package practice;

import java.util.List;

public class methodReferenceses {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		Integer max=List.of(1,5,6,8,3).stream().filter(methodReferenceses::isEven).max(Integer::compare).orElse(0);
		System.out.println(max);
	}
	public static boolean isEven(int n)
	{
		return n%2==0;
	}	
}
