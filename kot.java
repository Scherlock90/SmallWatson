package InstaceOf;

public class kot extends InstaceOf {
	
		String rasa;
		
		kot()
		{
			
		}
		kot(String imie, String nazwisko, String rasa)
		{
			super(imie, nazwisko);
			this.rasa = rasa;
		}
		public void opisIstoty()
		{
			System.out.println("Imię: " + imie);
			System.out.println("Nazwisko:  " + nazwisko);
			System.out.println("Rasa:  " + rasa);
			System.out.println("Kot to zwierze, które lubi psocić");
		}
		
		public void karma()
		{
			System.out.println("Dla kota najlepsza jest wieprzowinka");
		}
		
		
	}
