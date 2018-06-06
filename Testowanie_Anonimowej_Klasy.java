package zagniezdzenieKlas;

public class Testowanie_Anonimowej_Klasy 
{

	public static void main(String[] args) 
	{
		przyciskLosowy pL1 = new przyciskLosowy();
		przyciskLosowy pL2 = new przyciskLosowy();
		przyciskLosowy pL3 = new przyciskLosowy();	
		
		pL1.wcisniecie(new działaniePrzycisku() 
		{	
			@Override
			public void efektWcisniecia() {
				
				System.out.print("Pojawia się burak");	
			}
		});		
		
		pL2.wcisniecie(new działaniePrzycisku()
			{
			@Override
			public void efektWcisniecia() 
			{
				System.out.println("\n" + "pojawia się ziemniak");		
			}	
		});
		
		
	}
}

interface działaniePrzycisku
{
	void efektWcisniecia();
}

class przyciskLosowy
{
	void wcisniecie(działaniePrzycisku dzP)	
	{
		dzP.efektWcisniecia();	
	}
}
