package practice;

import java.util.HashMap;
import java.util.Map;

public class countRepeatedchar {

	public static void main(String[] args)
	{
		String s="my name is akhilesh your name is akhil";
		Map<String,Integer> m=new HashMap<String,Integer>();
		String[] c= s.split(" ");
		
		for(String ct:c)
		{
			Integer x=m.get(ct);
			System.out.println(x+" * "+ct+" + "+m);
			if(x==null)
			{
				m.put(ct,1);
			}
			else
			{
				m.put(ct, x+1);
			}
		}
		System.out.println(m);
	}

}
