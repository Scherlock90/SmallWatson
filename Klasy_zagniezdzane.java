package zagniezdzenieKlas;

public class Klasy_zagniezdzane {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A zewnetrzna = new A();		//w końcu załapałem konstrukcję tego :D new A() to jest odniesienie do konstruktora( A() )  z klasy A
		
		A.B zagniezdzona = zewnetrzna.new B();	// konstrukcja jest taka, że odnosimy się do klasy zewnętrznej pierw, następnie do klasy zagnieżdzonej...
												// ...potem jest stworzony konstruktor zagniezdzony w oparciu o zmienną z klasy zewnętrznej
		A.C zagniezdzonaStatyczna = new A.C();	// ze statycznymy jest podobnie poza tym, że nie trzeba się odnosić do zmiennej z klasy zewnętrznej
		
		
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
	static class C			//statyczna klasa uniemozliwia do niej dostep klasom zewnętrznym
	{
		private static int sprawdzianStatycznej;	//zmienna statyczna do uzytku klasy statycznej
		C()
		{
			System.out.println("Klasa zagniezdzona statyczna C");
		}
		static void cos3()
		{
			sprawdzianStatycznej = 999;	//jedynie w tej metodzie mozna sie odnieść się do zmiennej statycznej
			System.out.println("takie cos ze statycznej zagniezdzonej C + spradzian " + sprawdzianStatycznej);
		}
	}
}