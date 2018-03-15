package InstaceOf;

public abstract class InstaceOf {		// konstruktor musi się odnosić do nazwy głównej klasy (tutaj jest to InstaceOf
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InstaceOf [] iS = new InstaceOf[4];
				
		iS[0] = new człowiek("Natalia", "Bura", "Kobieta");
		iS[1] = new kot("Jasmina", "Arabuska", "Dachowiec");
		iS[2] = new człowiek("Sebastian", "Napora", "Mężczyzna");
		
		//iS[1].opisIstoty();
		//iS[0].opisIstoty();
		
		//for (int i = 0; i < iS.length; i++)		//pętla for zwykła --keyword length odnosi się do zawartości zmiennej iS (która obecnie jest tablicą, a ponieważ mamy 4 referencje do wyboru a zdeklarowane mamy 2, więc będzie pokazywało błąd...
		//{										//...aby ten błąd poprawić należy użyć formuły instanceof, która powoduje odniesienie tylko do zdeklarowanych referencji
		//	if(iS[i] instanceof InstaceOf)
		//	{
		//	iS[i].opisIstoty();
		//	}
		//	else
		//		break;
			
			for (InstaceOf binding: iS)		// binding czyli odczytywanie dodatkowych metod, które pochodzą z klasy dziedziczących(dzieci) a nie z klasy, z której się dziedziczy (rodzic)
			{
				if (binding instanceof kot)	// 1. jeżeli zamiast InstaceOf dam klasę "człowiek" wówczas będzie odczytywało z tablicy wszystkie dane odnoszące się do klasy człowiek	//odniesienie do klasy dziedziczącej(dziecka)
				{							//2. odniesienie do klasy kot pozwoli wykorzystać z niej metody, których nie ma w innych klasach
					//((człowiek)binding).opisIstoty();		// ad.1. downcasting - czyli póżniejsze wiązanie z klasą człowiek i jej danymi
					((kot)binding).karma();				// ad.2. wiązanie do klasy kot i metody w niej zawartej
					//kot tmp = (kot)binding;		// 3. tmp - jest to tymczasowa zmienna wykorzystywana do odczytu z klasy dziedziczącej
					//tmp.karma();				//ad.3. tutaj wybieramy po kropce dodatkową metodą z klasy dziedziczącej
				}
					
			}
				
		//}
		
		//istnieje też ulepszona formuła dla for podobna do tej z pętli foreach, a mianowicie ...
		// ... for ( InstaceOf bakłażan: iS)
		// 	kolejno	  String + zmienna nowa : zmienna z której będą pobrane dane
		// 	if (bakłażan instanceof InstaceOf)
		//      nowa zmienna + formuła instanceof : INSTANCJA DO KTÓREJ SIĘ ODNOSIMY
		// 	bakłażan.opisIstoty();
		//   nowa zmienna.odniesienie do metody
		
		
	}

}
