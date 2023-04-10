import java.util.*;

public class countRepeatedString {

	public static void main(String[] args)
	{
		String s="my name is akhilesh your name is akhil";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		char[] c= s.toCharArray();
		
		for(char ct:c)
		{
			Integer x=m.get(ct);
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
