import java.util.Date;

public class Klasa_Object extends Object implements auto_podstawa {
	
	//final static Date dataZatrudnienia = new Date();	//final uniemożliwia korzystanie z tej właściwości/properties w innych miejscach poza tą klasą
														//zaś tworzenie obecnej daty jest z użyciem z importowanego pacunku java.util.Date, tworzenie daty musi się kończyć new Date wówczas można się odnosić 
	final Date dataZatrudnienia; // druga opcja z properties
	
	Klasa_Object()
	{
		this.dataZatrudnienia = new Date();		//odniesienie do zmiennej i tworzenie nowej daty
	}
	
	Klasa_Object(Date data)
	{
		this.dataZatrudnienia = data;		// odniesienie do zmiennej i połączenie z przesyłaną data
	}
	
	Date getDataZatrudnienia()
	{
		return this.dataZatrudnienia;		//zwracanie gettera zmiennej daty
	}
	
	public void data(Date data)
	{
		
		//this.dataZatrudnienia = data; // nie będzie działało ponieważ, jest fina w properties i static, czyli niezmienialne, ostateczne.
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//System.out.println("Obecna data: " + dataZatrudnienia);		//niezbędnę było określenie, że jest to properties statyczna
		
		auto_podstawa aP = new Pracownik();		//łączenie z implementowanego interfejsu z klasą go implementującą
		System.out.println(aP.predkosc);
		
		auto_podstawa.szybkość();		// wydobywanie metody z intefejsu musi wiązać się z jego wybraniem i odniesieniem
		
		
		
	
		
		//Klasa_Object aAa = new Pracownik();
		//System.out.println(((Pracownik)aAa).getCzasPracy()); 		//downcasting (czyli rzutowanie z klasy niżej do klasy wyżej pewnych metod, czy wartości
		//((Pracownik)aAa).getCzasPracy(); 		// nie zadziała, jeżeli klasa rzutowana nie będzie oddzielnie zmontowana
		
		Object a = new Object();
		Object a2 = new Object();
		
		
	}
		public boolean equals(Object a)	//nadpisane wskazuje do super klasy Object
		{
			return false;
		}
	
		
}