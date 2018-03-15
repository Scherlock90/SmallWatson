package InstaceOf;

public class człowiek extends InstaceOf {

		String płeć;
		
		człowiek()
		{
			
		}
		człowiek(String imie, String nazwisko, String płeć)
		{
			super(imie, nazwisko);		//jeżeli jest super to odnosimy się do tych parametrów, które są w bazowej clasie ujęte a nie dodajemy kolejnego z obecnej klasy
			this.płeć = płeć;			//ponieważ dodaliśmy parametr płeć to nie dodajemy go do clasy super w powyższej linijce
		}
		
		public void opisIstoty()
		{
			System.out.println("Imię: " + imie);
			System.out.println("Nazwisko:  " + nazwisko);
			System.out.println("Płeć:  " + płeć);
			System.out.println("Człowiek to myśląca istota");
			
		}
		
	}
