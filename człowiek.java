package InstaceOf;

public class człowiek extends InstaceOf {

		String płeć;
		
		człowiek()
		{
			
		}
		człowiek(String imie, String nazwisko, String płeć)
		{
			super(imie, nazwisko);		
			this.płeć = płeć;			
		}
		
		public void opisIstoty()
		{
			System.out.println("Imię: " + imie);
			System.out.println("Nazwisko:  " + nazwisko);
			System.out.println("Płeć:  " + płeć);
			System.out.println("Człowiek to myśląca istota");
			
		}
		
	}
