package practice;
	class t 
	{int i;
		
		public t()
		{ 
			
			System.out.println("t class "+i);
		}
		public void akki()
		{
			System.out.println("akki class ");
		}
	}
	 class t1 extends t
	{	  
		t1()
		{   
		 super.i=100;
			System.out.println("t1 class "+" "+ super.i);
		}
	}
	 
public class superr {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1 t=new t1();
		
	}

}
