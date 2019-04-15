/**
 * 
 */
package tabliczkaMnozenia;

/**
 * @author Lenovo
 *
 */

public class Butelka {

	double iloscLitrow;	
	
	public Butelka()	
	{
		iloscLitrow = 10; 
	}
	
	Butelka(double iloscLitrow)	
	{
		this.iloscLitrow = iloscLitrow;	
	}
	
	double getIloscLitrow()		
		{				 
			return iloscLitrow; 
		}
	
	void wlej(double ilosc)  
	{
		
		this.iloscLitrow += ilosc;	
		
	}
	
	void wylej (double ilosc) 		
	{
		this.iloscLitrow -= ilosc;		
	}
	
	void przelej (double ilosc, Butelka gdzie)	
	{
		this.wylej(ilosc);	
		gdzie.wlej(ilosc);	
		
	}
	
	public static void main(String[] args){

		Butelka bk = new Butelka(5);
		Butelka bk2 = new Butelka(10);
			
		System.out.println("\n" + "Blok odnoszący się do samej butelki i jej klasy");
		
		Butelka[] butelka = new Butelka[3];	
		
		butelka [0] = new Butelka(5);   
		butelka [1] = new Butelka(7);
		butelka [2] = new Butelka(8);
		
		butelka [0].wlej(10);   
		butelka [1].wylej(2);     
		
		butelka[0].przelej(15, butelka[1]); 
		
		System.out.println(butelka [0].getIloscLitrow()); 		
		System.out.println(butelka [1].getIloscLitrow());
		System.out.println(butelka [2].getIloscLitrow());
		
		// -------------------------------- Exceptions ---------------------------------
		//Wyjatki wyj = new Wyjatki("Za mało czegoś tam");	
		//System.out.println(wyj);	
		
		//wyj.getMessage();	
		
		System.out.println("\n" + "Blok z wyjątkami");
		
		int cos = 10;
		
		try {
			if (cos == 10)
				throw new Wyjatki("masz dziesięć kociaków");
			}
		catch (Wyjatki xX)
		{
			System.out.println("Nowy wyjatek: " + xX.toString());	
		}
				
		try 
		{
			System.out.println(5/0);			
		}
		catch(Exception ix)
		{
			System.out.print("Powstał wyjątek" + ix.getMessage());	
		}
		finally
		{
			int a = 5;
			int b = 6;
			int c = a + b;
			System.out.println("\n" + "Za każdym razem mi pokaż tą linijkę i tekst " + c);
		}
		
		
	}

}

class Wyjatki extends Exception
{
	String Wyjątek;
	
	public Wyjatki(String Wyjątek)
	{
		this.Wyjątek = Wyjątek;	
	}
	@Override
	public String toString() {
		return this.Wyjątek;
	}
}




