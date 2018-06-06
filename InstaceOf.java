package InstaceOf;

public abstract class InstaceOf 
{		
	protected String imie;
	protected String nazwisko;
	
	InstaceOf()
	{
		
	}
	
	InstaceOf(String imie, String nazwisko)
	{
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public abstract void opisIstoty();
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		InstaceOf [] iS = new InstaceOf[4];
				
		iS[0] = new człowiek("Natalia", "Bura", "Kobieta");
		iS[1] = new kot("Jasmina", "Arabuska", "Dachowiec");
		iS[2] = new człowiek("Sebastian", "Napora", "Mężczyzna");
		
		//Other solution
		//iS[1].opisIstoty();
		//iS[0].opisIstoty();
		
		//for (int i = 0; i < iS.length; i++)		
		//{										
		//	if(iS[i] instanceof InstaceOf)
		//	{
		//	iS[i].opisIstoty();
		//	}
		//	else
		//		break;
			
			for (InstaceOf binding: iS)		
			{
				if (binding instanceof kot)	
				{							
					((kot)binding).karma();				
					//kot tmp = (kot)binding;		
					//tmp.karma();				
				}	
			}		
	}

}
