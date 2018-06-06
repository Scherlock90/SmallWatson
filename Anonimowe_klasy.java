package zagniezdzenieKlas;

import java.net.NetworkInterface;

public class Anonimowe_klasy 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		zachowaniePrzycisku zP = new zachowaniePrzycisku() 
		{

			@Override
			public void działaniePrzycisku() 
			{
				// TODO Auto-generated method stub	
				System.out.println("Jestem z klasy anonimowej przyciskiem zP");
			}
		};
		
		zachowaniePrzycisku m = new zachowaniePrzycisku() 
		{		

			@Override
			public void działaniePrzycisku() 
			{		
				// TODO Auto-generated method stub
				System.out.println("M jak malina, a tak naprawdę mogę odpowiadać za przycisk M w klasie anonimowej");
			}		
		};
			
		zP.działaniePrzycisku();
		m.działaniePrzycisku();
	}

}

interface zachowaniePrzycisku 
{
	void działaniePrzycisku();			
}

class przycisk		
{
	void akcja()
	{
		
	}
}