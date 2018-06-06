package dziedziczenie;

import java.util.Arrays;
import java.util.Collections;

public abstract class Auta {		
	
	protected double predkosc = 10;		
	protected double koszt = 10000;
		
	public Auta()			
	{
		
	}
	public Auta(double predkosc, double koszt)	
	{
		this.predkosc = predkosc;
		this.koszt = koszt;
		
	}
	
		double getPredkosc()		
		{
			return predkosc;
		}
		
		double getKoszt()			
		{
			return koszt;
		}
	
			public void predkoscAuta(int czas)		
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
		
			public void kosztAuta(int rocznik)		
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
			protected abstract void opis();		
			
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
		
		// If you want use Abstarct Class
		//Auta aA = new Auta();		
		// Auta aA = new Porshe();  
		
		Auta aA = new Porshe();		
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
