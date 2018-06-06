package zagniezdzenieKlas;
/**
 * <pre>
 * @author Sebastian
 * @since 2018/03/18
 * kałabanka
 * kaszanka
 * </pre>
 */

public class Agregacja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		wychowanek wych = new wychowanek("Jakub", new adres("Łomżyńska", 24)); 
				
		System.out.println(wych);
		
	}

}

class wychowanek
{
	String imie;	
	adres adresWychowanka;
	
	
	public wychowanek(String imie, adres adresWychowanka) 
	{	
		this.imie = imie;	
		this.adresWychowanka = adresWychowanka;	
	}
	/**
	 * <pre>
	 * tutaj użyta zostałą metoda toString
	 * mało tego teraz dodaje komentarz - tak a propo tworzenia dokumentacji - no to się bawimy :-)
	 * </pre>
	 */
	@Override
	public String toString() 
	{		
		return this.imie + " " + adresWychowanka.ulica + " " + adresWychowanka.nrDomu;	
	}
}

class adres	
{
	String ulica;
	int nrDomu;
	
	public adres(String ulica, int nrDomu) 
	{
		this.ulica = ulica;	
		this.nrDomu = nrDomu;	
	}	
}