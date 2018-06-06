package dziedziczenie;

public class Porshe extends Auta implements Comparable {			
	
	@Override
	public int compareTo(Object o) {			
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

	
	public Porshe()				
	{
		
	}
	
	public Porshe(double predkosc, double koszt)		
	{
		super(predkosc, koszt);				
	}
	@Override
	public void kosztAuta(int rocznik)		
	{										
		super.kosztAuta(rocznik);			
		if (rocznik > 2015)				
			koszt += 3000;
		else
			koszt -=1000;
	}
	@Override
	protected void opis()		
	{
		System.out.println("Porshe to jest super szybkie auto");
	}

}
