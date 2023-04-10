package practice;

import java.util.ArrayList;

public class generics<T>{

	ArrayList <T>  list = new ArrayList<>();
	public void addElement(T name)
	{
		list.add(name);
	}
	public void getElement(int i)
	{
		list.remove(i);
	}
	public String toString()
	{
		return list.toString();
	}
}
