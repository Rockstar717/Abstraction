package abstraction.java;

abstract class School{
	
	void name()
	{
		System.out.println("enter school name");
	}
	 void lecture()
	 {
			System.out.println("what the time of lecture");
   	}
}

public class Byabstractclass extends School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Byabstractclass b = new  Byabstractclass();
		 b.name();
		 b.lecture();

	}
}