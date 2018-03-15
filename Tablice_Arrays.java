import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tablice_Arrays implements Comparable {

	double liczba;
	private double Tablice_Arrays;
	
	Tablice_Arrays()
	{
		
	}
	Tablice_Arrays(double liczba)
	{
		this.liczba = liczba;
	}
	
	double getLiczba()
	{
		return liczba;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tablice_Arrays[] tab = new Tablice_Arrays[4];		//do sorotowania odwrotnego tablicy zwykłej niezbędne było umiejscowienie jej w tablicy z konstruktora
		
		//double[] tab = new double[4];
		
		tab[0] = new Tablice_Arrays(-19);		//dzięki konstruktorowi mogłem zastosować sortowanie odwrotne
		tab[1] = new Tablice_Arrays(-9);
		tab[2] = new Tablice_Arrays(9);
		tab[3] = new Tablice_Arrays(99);
		
		System.out.println("Sortowanie od najmniejszej do największej");
		Arrays.sort(tab);		// sortuje od najmniejszej do największej
		
		for (Tablice_Arrays sortowanko: tab)		// w tej pętli musi znajdować się odpowiedni typ zmiennej String (gdy są nazwy), int gdy tablica jest zbiorem liczb itd.
		{
			 System.out.println(sortowanko.getLiczba());		//odniesienie do nowej zmiennej aby wyświetliwło zawartość tablicy	
		}
		System.out.println("Sortowanie od największej do najmniejszej");
		Arrays.sort(tab, Collections.reverseOrder());		// sortuje od najmniejszej do największej
		
		for (Tablice_Arrays sortowanko: tab)		// w tej pętli musi znajdować się odpowiedni typ zmiennej String (gdy są nazwy), int gdy tablica jest zbiorem liczb itd.
		{
			 System.out.println(sortowanko.getLiczba());		//odniesienie do nowej zmiennej aby wyświetliwło zawartość tablicy	
		}			//żeby nie zobaczyć hashcode'u należy użyć gettera do którego odnosimy się zmienną.
		
		System.out.println("Porównywanie, tzn. CompareTo: " + tab[0].compareTo(tab[3])); 	//porównywanie za pomocą compareTo, było możliwe po ustanowieniu odpowiedniej instacji w tablicy z konstruktorem
																							//... i ustawienie w metodzie compareTo object
	}

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Tablice_Arrays przeslany =  (Tablice_Arrays)o;
		
		if (this.getLiczba() > przeslany.getLiczba())
		{
			return 1;
		}
		
		if (this.getLiczba() < przeslany.getLiczba())	//getter ułatwia ustawienie
		{
			return -1;
		}
	
		return 0;
	}
	

}
