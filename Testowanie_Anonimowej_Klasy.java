package zagniezdzenieKlas;

public class Testowanie_Anonimowej_Klasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		przyciskLosowy pL1 = new przyciskLosowy();
		przyciskLosowy pL2 = new przyciskLosowy();
		przyciskLosowy pL3 = new przyciskLosowy();	//nie utworzyłem odpowiedzi dla tej zmiennej :-)
		
		pL1.wcisniecie(new działaniePrzycisku() {	//jest to klasa anonimowa

			@Override
			public void efektWcisniecia() {
				// TODO Auto-generated method stub
				System.out.print("Pojawia się burak");	// tu ogólem mogę tworzyć, różne rozwiązania odpowiedzialnym w tym przycisku
			}
		});		//ten nawias jest przedłużeniem po wcisniecie, ponieważ póżniej następuję wywołanie interfejsu z konstruktorem ();
		
		pL2.wcisniecie(new działaniePrzycisku()	//w skrócie  mam zmienną do nazwy klasy, w której odnoszę się do metody, potem tworze keywodrem new nowy interejs, z konstruktorem w którym zawieram implementowaną metodę w której mogę podawać indywidualne działania tej zmiennej/przycisku w tym przypadku
			{

			@Override
			public void efektWcisniecia() {
				// TODO Auto-generated method stub
						
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
	void wcisniecie(działaniePrzycisku dzP)	//wiąże intefejs z klasą i przyporządkowuje zmienną
	{
		dzP.efektWcisniecia();	//w zmiennej wywołuje metodę intefrejsu
	}
}
