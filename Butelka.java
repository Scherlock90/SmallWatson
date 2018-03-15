/**
 * 
 */
package tabliczkaMnozenia;

/**
 * @author Lenovo
 *
 */
// W TYM MIEJSCU BYŁA MAŁA ZABAWA Z TYM JAK JA TO KUMAM, NO I ŚREDNIO KUMAM ALE 
// ANALIZUJAC CAŁOŚĆ W TEJ CHWILI ROZUMIEM ZALEŻNOŚĆ :)
public class Butelka {

	double iloscLitrow;	// zmienna do której cały czas się bedzie odnosić musi byc zadeklarowana osobno
	
	public Butelka()	//jest to konstruktor zadeklarowany dla obiektu Butelka i jeżeli usuniemy Butelka(double iloscLitrow) wowczas kazdy obiekt z nazwa Butelka w tablicy Butelka[] będzie zawierać 10 startowe
	{
		iloscLitrow = 10; //zamiast domyślnego konstruktora teraz kompilotor ma konkretny parametr
	}
	
	Butelka(double iloscLitrow)	// jest to konstruktor dominujacy (public Butelka vs Butelka(double iloscLitrow)) w tej chwili, ponieważ ma odniesienie this.
	{
		this.iloscLitrow = iloscLitrow;	
	}
	
	double getIloscLitrow()		//aby cokolwiek zachulało przy przesyle, musi być getter do którego odnosić się bedzie zawsze zmienna i do którego będzie wracać (return)
		{				//do tego gettera odnosimy sie w System.out.Println 
			return iloscLitrow; 
		}
	
	void wlej(double ilosc) // moze tu tez byc metoda boolean, w której bedziemy umieszczali warunki dajace stwierdzenia true or false 
	{
		
		this.iloscLitrow += ilosc;	//tu jest przeciwnie do wylej dodajemy do wartosci zmienne(cyfry)
		
	}
	
	void wylej (double ilosc) 		//tu takze mozemy dac metode boolean
	{
		this.iloscLitrow -= ilosc;		//aby z tego miejsca zabrać dane należy odnieść się do zmiennej double iloscLitrow od ktorej odejmujemy zmienna ilość (którą możemy podać w postaci cyfry)
	}
	
	void przelej (double ilosc, Butelka gdzie)	//wybierając tą metodę umożliwiamy wybranie zmiennej cyfrowej i zmiennej(gdzie) do obiektu/klasy (Butelka)
	{
		this.wylej(ilosc);	//this jest kluczowe, gdyż umożliwia uzycie metody w ktore dodajemy zmienna double ilosc, aby przeniesc z obiektu dane
		gdzie.wlej(ilosc);	// łącząc zmienną (gdzie) z metodą (wlej) umożliwiamy przesyłanie między nimi danych
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Butelka[] butelka = new Butelka[3];	//tworzenie nowego obiekto-tablicy z określeniem ilości zawartych w niej zmiennych/obiektów
		
		butelka [0] = new Butelka(5);   //tworzenie zbioru zmiennych odpowiadających numerowi w tablicy [3]
		butelka [1] = new Butelka(7);
		butelka [2] = new Butelka(8);
		
		butelka [0].wlej(10);   /// to samo co na dolnej linijce ;)
		butelka [1].wylej(2);    //należy stworzony obiekt z tablicy wybrać i aktywować metodę, aby ją wykorzystać 
		
		butelka[0].przelej(15, butelka[1]); ///// pierwsza jest to wartość jaką chcemy przenięść double, a druga to zmienna do której będziemy przenosić wartość
		
		
		System.out.println(butelka [0].getIloscLitrow()); 		// dzięki wybraniu gettera do obiektu umożliwiamy zainicjowanie dalszego wykorzystania metod
		System.out.println(butelka [1].getIloscLitrow());
		System.out.println(butelka [2].getIloscLitrow());
		
		
		
		
	}

}
