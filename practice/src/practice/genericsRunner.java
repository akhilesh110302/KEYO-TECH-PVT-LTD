package practice;

public class genericsRunner {

	public static void main(String[] args) {
		generics<String> g=new generics<>();
		
		g.addElement("akhilesh");
		g.addElement("akhil");
		g.getElement(1);
		System.out.println(g);
		
		generics<Integer> g1=new generics<>();
		
		
		g1.addElement(Integer.valueOf(62));
		g1.addElement(Integer.valueOf(67));
		g1.getElement(1);
		System.out.println(g1);
	}

}
