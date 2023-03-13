package abstraction.java;

	interface  College
	{
		abstract void marks ();
		abstract void lecture();	
	}
	public class Interface implements College {
	
	 public void marks() 
		{
			System.out.println("enter the marks");
		}
	
	 public void lecture()
	{
		System.out.println("which lecture start now");
	}
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Interface i = new Interface ();
			i.marks();
			i.lecture();
		}
	
	}
