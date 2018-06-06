package dziedziczonkoProtected_modyfikator;
import dziedziczenie.Auta;		

public class Fiat extends Auta {		
	
	public void fiacik()
	{
		this.predkosc = 0;		
	}
	@Override
	protected void opis()
	{
		System.out.println("Class use protected mod");
	}
}




