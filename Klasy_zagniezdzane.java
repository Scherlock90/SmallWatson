package zagniezdzenieKlas;

public class Klasy_zagniezdzane 
{
	
	public static void main(String[] args) 
	{
				
		A zewnetrzna = new A();		
		
		A.B zagniezdzona = zewnetrzna.new B();	
		
		A.C zagniezdzonaStatyczna = new A.C();	
		
		zewnetrzna.cos();
		zagniezdzona.cos2();
		zagniezdzonaStatyczna.cos3();
		
	}
}

class A
{
	private int sprawdzian;
	A()
	{
		System.out.print("Klasa zewnętrzna A ");
	}
	void cos()
	{
		System.out.println("takie tam z klasy zewnetrznej A + sprawdzian " + sprawdzian);
	}
	class B
	{
		B()
		{
			System.out.println("\n" +"Klasa zagniezdzona B");
		}
		
		void cos2 ()
		{
			sprawdzian = 25;
			System.out.println("takie tam cos 2 z klasy zagniezdzonej B + spradzian " + sprawdzian);
		}
	}
	static class C			
	{
		private static int sprawdzianStatycznej;	
		C()
		{
			System.out.println("Klasa zagniezdzona statyczna C");
		}
		static void cos3()
		{
			sprawdzianStatycznej = 999;	
			System.out.println("takie cos ze statycznej zagniezdzonej C + spradzian " + sprawdzianStatycznej);
		}
	}
}