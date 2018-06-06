import java.util.Date;

public class Klasa_Object extends Object implements auto_podstawa 
{
	final Date dataZatrudnienia; 
	
	Klasa_Object()
	{
		this.dataZatrudnienia = new Date();		
	}
	
	Klasa_Object(Date data)
	{
		this.dataZatrudnienia = data;		
	}
	
	Date getDataZatrudnienia()
	{
		return this.dataZatrudnienia;		
	}
	
	public void data(Date data)
	{
	
	}
	
	public static void main(String[] args) 
	{
		auto_podstawa aP = new Pracownik();		
		System.out.println(aP.predkosc);
		
		auto_podstawa.szybkość();			
		
		Object a = new Object();
		Object a2 = new Object();
	}
		public boolean equals(Object a)	
		{
			return false;
		}		
}