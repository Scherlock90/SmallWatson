package zagniezdzenieKlas;

public class Anonimowe_klasy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		przycisk2 p = new przycisk2();	//tworzenie zmiennych do których można przypisać klasę anonimową
		przycisk2 p3 = new przycisk2();
		przycisk2 p4 = new przycisk2();
		
		p.akcja(new zachowaniePrzycisku1(){		//jest to klasa anonimowa - bez nazwy, do której trzeba będzie zimplementować metodę z intefejsu oraz na końcu po } klamerce dać znak ; by działała istotne.

			@Override
			public void działaniePrzycisku2() {		//tutaj możemy ustalić indywidualne działanie przycisku m - zmiennej ustalonej powyżej
				// TODO Auto-generated method stub
				System.out.println("M jak malina, a tak naprawdę mogę odpowiadać za przycisk M w klasie anonimowej");
			}		
		}); 
		
		p3.akcja(new zachowaniePrzycisku1(){		//jest to klasa anonimowa - bez nazwy, do której trzeba będzie zimplementować metodę z intefejsu oraz na końcu po } klamerce dać znak ; by działała istotne.

			@Override
			public void działaniePrzycisku2() {		//tutaj możemy ustalić indywidualne działanie przycisku m - zmiennej ustalonej powyżej
				// TODO Auto-generated method stub
				System.out.println("K jak Kalafior, a tak naprawdę mogę odpowiadać za przycisk K w klasie anonimowej");
			}		
		});
		
		p4.akcja(new zachowaniePrzycisku1(){		//jest to klasa anonimowa - bez nazwy, do której trzeba będzie zimplementować metodę z intefejsu oraz na końcu po } klamerce dać znak ; by działała istotne.

			@Override
			public void działaniePrzycisku2() {		//tutaj możemy ustalić indywidualne działanie przycisku m - zmiennej ustalonej powyżej
				// TODO Auto-generated method stub
				System.out.println("S jak Salamandra, a tak naprawdę mogę odpowiadać za przycisk S w klasie anonimowej");
			}		
		});
	}

}

interface zachowaniePrzycisku1 
{
	void działaniePrzycisku2();			// będzie implementowana przez każdy przycisk nowy
}

class przycisk2		//tworzenie pojedynczych klass do przycisków o podobnym działaniu, itp. może być bezsensowne
{
	void akcja(zachowaniePrzycisku1 zP1)	//umieszczenie intefejsu umozliwia przeslanie jego zawartosci do metody potrzebne tez jest od razu okreslenie zmiennej do której się bedzie można odnosić w metodzie
	{
		zP1.działaniePrzycisku2();	//zmienna, dzięki której można wywołać metodę z interfejsu	
	}
}