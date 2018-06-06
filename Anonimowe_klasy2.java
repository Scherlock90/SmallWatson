package zagniezdzenieKlas;

public class Anonimowe_klasy2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		przycisk2 p = new przycisk2();
		przycisk2 p3 = new przycisk2();
		przycisk2 p4 = new przycisk2();
		
		p.akcja(new zachowaniePrzycisku1()
		{		

			@Override
			public void działaniePrzycisku2() 
			{		
				System.out.println("M jak malina, a tak naprawdę mogę odpowiadać za przycisk M w klasie anonimowej");
			}		
		}); 
		
		p3.akcja(new zachowaniePrzycisku1()
		{		
			@Override
			public void działaniePrzycisku2() 
			{	
				System.out.println("K jak Kalafior, a tak naprawdę mogę odpowiadać za przycisk K w klasie anonimowej");
			}		
		});
		
		p4.akcja(new zachowaniePrzycisku1()
		{		
			@Override
			public void działaniePrzycisku2() 
			{		
				System.out.println("S jak Salamandra, a tak naprawdę mogę odpowiadać za przycisk S w klasie anonimowej");
			}		
		});
	}

}

interface zachowaniePrzycisku1 
{
	void działaniePrzycisku2();			
}

class przycisk2		
{
	void akcja(zachowaniePrzycisku1 zP1)	
	{
		zP1.działaniePrzycisku2();		
	}
}