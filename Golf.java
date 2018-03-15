package dziedziczenie;

public class Golf extends Auta {

	public Golf()
	{
		
	}
	public Golf(double predkosc, double koszt)
	{
		super(predkosc, koszt);
	}
	@Override
	protected void opis()
	{
		System.out.println("Golf to auto dla mas");
	}
	
}
