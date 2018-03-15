package dziedziczenie;

public class Porshe extends Auta implements Comparable {			// roszerzenie w dziedziczeniu o właściwości z klasy rodzic(Auta) w klasie dziecko (Porshe) 
					/// do sorotwania i odwracania sortowania niezbedny jest interfejs Comparable
	@Override
	public int compareTo(Object o) {			//tutaj przesyłamy do obiektu wartość, którą chcemy sorotować lub odwracać
		// TODO Auto-generated method stub
		
		Porshe przesłane = (Porshe)o;
		
		if (this.predkosc > przesłane.predkosc)
		{
			return 1;
		}
		
		if (this.predkosc < przesłane.predkosc)
		{
			return - 1;
		}
		
		return 0;
	}

	// by móc korzystać w obu z metody zawartych w klasie rodzic
	public Porshe()				//konstruktor domyślny musi być stworzony
	{
		
	}
	
	public Porshe(double predkosc, double koszt)		//konstruktor niedomyślny, w którym określamy instrukcje, wartości, itd.
	{
		super(predkosc, koszt);				// klasa super umozliwia wywołanie klasy rodzica (Auta) a potem klasy dziecko (Porshe) - dziedziczenie
	}
	@Override
	public void kosztAuta(int rocznik)		//tutaj nadpisana poprzez metode @ovveride - czyli przypisywanie do orginału z Auta i...
	{										// ... osobnych instrukcji do tej klasy Porshe
		super.kosztAuta(rocznik);			// klasa super umozliwia najpierw wywołanie metody bazowej/rodzica (z klasy Auta) a potem metody z...
		if (rocznik > 2015)					// ... klasy następnej/dziecka (klasa Porshe
			koszt += 3000;
		else
			koszt -=1000;
	}
	@Override
	protected void opis()		//nadpisana metoda (@Override) z klasy głównej Auta - abstrakcyjna, hasło protected tak jak w metodzie matce musi sie pojawic
	{
		System.out.println("Porshe to jest super szybkie auto");
	}

}
