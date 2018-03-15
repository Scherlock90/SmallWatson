package dziedziczenie;

import java.util.Arrays;
import java.util.Collections;

public abstract class Auta {		//tutaj dodalismy keyword abstract umozliwia on wówczas tworzenie metod abstrakcyjnych do dziedziczenia w innych klasach

	protected double predkosc = 10;		//modyfikator dostępu protected uniemozliwia korzystania z własciwosci czy metod przez inne pakunki o ile nie zostana rozszerzone o tą klasę w której jest protected
	protected double koszt = 10000;
		
	public Auta()			//domyślny konstruktor klasy Auta 
	{
		
	}
	public Auta(double predkosc, double koszt)		//niedomyślny konstruktor klasy Auta, w którym zawieramy instrukcje.
	{
		this.predkosc = predkosc;
		this.koszt = koszt;
		
	}
	
		double getPredkosc()		// tutaj do czego będzie zwracana wartość double predkosc - return istotne!
		{
			return predkosc;
		}
		
		double getKoszt()			// tutaj do czego będzie zwracana wartość double koszt - return istotne!
		{
			return koszt;
		}
	
			public void predkoscAuta(int czas)		//metoda do której możemy się odnieść.
			{
				if(czas > 50)
				{
					predkosc += 20;
					System.out.println("Prędkość jest niezbyt wysoka");
				}
				else if (czas < 30)
				{
					predkosc += 40;
					System.out.println("Zawrotna predkość");
				}
				else 
				{	System.out.println("nie jedzie auto");
				}
			}
		
			public void kosztAuta(int rocznik)		//gdybym tu dał private na początku wówczas w innych klasach nie było by do tego dostępu, tylko w tej
			{
				if (rocznik < 2015)
				{
					koszt -= 5000;
				}
				else if (rocznik > 2015)
				{
					koszt += 4000;
				}
				else 
				{	System.out.println("koszt się nie zwiększył");
				}
			}
		// TODO Auto-generated method stub
			protected abstract void opis();		//abtract i protected jest potrzebne, ale abstract powoduje, że w innych klasach..
												//...mozna dodawać instrukcje bez wpisywania jej w klasie ogólnej dziedziczonej. Tutaj nie musimy nic pisać ani dodawać to jest plus.	//jest dziedziczona przez wszystkie klasy
	public static void main(String[] args) {

		Auta [] tablicaAut = new Auta[4];
		tablicaAut[0] = new Porshe(200, 2000);
		tablicaAut[1] = new Porshe(140,4000);
		tablicaAut[2] = new Porshe(220,10000);
		tablicaAut[3] = new Porshe(160,5500);
		
		Arrays.sort(tablicaAut);
		
		System.out.println("Po sortowaniem");
		for(Auta aT: tablicaAut)
		{
			System.out.println(aT.getPredkosc());
		}
		
		Arrays.sort(tablicaAut, Collections.reverseOrder());
		
		System.out.println("odwrotne sortowanie");
		for(Auta aT: tablicaAut)
		{
			System.out.println(aT.getPredkosc());
		}
		
		
		//Auta aA = new Auta();		//stworzenie nowego obiektu (aA) z klasy Auta //ten obiekt nie działa przy klasie abstrakcyjnej
		// Auta aA = new Porshe();  // stworzenie nowego obiektu (aA) z klasy Porshe, dzięki czemu teraz odnosić można się do obu klas...
									//...tzn, do klasy Auta i klasy Porshe jednocześnie === polimorfizm.
		Auta aA = new Porshe();		//ten obiekt działą przy klasie abstrakcyjnej
		aA.getKoszt();
		aA.getPredkosc();
		aA.kosztAuta(2017);
		
		Porshe pR = new Porshe(200, 2000);
		Golf gF = new Golf(170,2000);

		gF.getPredkosc();
		gF.getKoszt();

		pR.getPredkosc();
		pR.getKoszt();

		gF.kosztAuta(2016); gF.predkoscAuta(60);
		pR.kosztAuta(2017);	pR.predkoscAuta(10);
		
		gF.opis();
		pR.opis();
		
		System.out.println("Auto " + aA.getKoszt());
		System.out.println("Golf cena: " + gF.getKoszt());
		System.out.println("Golf predkosc:  " + gF.getPredkosc());
		System.out.println("Porshe cena:  " + pR.getKoszt());
		System.out.println("Porshe predkosc:  " + pR.getPredkosc());
		
	}

}
