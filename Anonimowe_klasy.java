package zagniezdzenieKlas;

import java.net.NetworkInterface;

public class Anonimowe_klasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		zachowaniePrzycisku zP = new zachowaniePrzycisku() {

			@Override
			public void działaniePrzycisku() {
				// TODO Auto-generated method stub	
				System.out.println("Jestem z klasy anonimowej przyciskiem zP");
			}
		};
		
		zachowaniePrzycisku m = new zachowaniePrzycisku() {		//jest to klasa anonimowa - bez nazwy, do której trzeba będzie zimplementować metodę z intefejsu oraz na końcu po } klamerce dać znak ; by działała istotne.

			@Override
			public void działaniePrzycisku() {		//tutaj możemy ustalić indywidualne działanie przycisku m - zmiennej ustalonej powyżej
				// TODO Auto-generated method stub
				System.out.println("M jak malina, a tak naprawdę mogę odpowiadać za przycisk M w klasie anonimowej");
			}		
		};
		
		// aktywacje przycisku i zachowania do niego przyporządkowanego
		
		zP.działaniePrzycisku();
		m.działaniePrzycisku();
	}

}

interface zachowaniePrzycisku 
{
	void działaniePrzycisku();			// będzie implementowana przez każdy przycisk nowy
}

class przycisk		//tworzenie pojedynczych klass do przycisków o podobnym działaniu, itp. może być bezsensowne
{
	void akcja()
	{
		
	}
}