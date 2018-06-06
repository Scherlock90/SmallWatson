import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tablice_Arrays implements Comparable 
{
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
	
	public static void main(String[] args) 
	{
		
		Tablice_Arrays[] tab = new Tablice_Arrays[4];		
		
		tab[0] = new Tablice_Arrays(-19);	
		tab[1] = new Tablice_Arrays(-9);
		tab[2] = new Tablice_Arrays(9);
		tab[3] = new Tablice_Arrays(99);
		
		System.out.println("Sortowanie od najmniejszej do największej");
		Arrays.sort(tab);	
		
		for (Tablice_Arrays sortowanko: tab)		
		{
			 System.out.println(sortowanko.getLiczba());			
		}
		System.out.println("Sortowanie od największej do najmniejszej");
		Arrays.sort(tab, Collections.reverseOrder());		
		
		for (Tablice_Arrays sortowanko: tab)		
		{
			 System.out.println(sortowanko.getLiczba());		
		}					
		System.out.println("Porównywanie, tzn. CompareTo: " + tab[0].compareTo(tab[3])); 	
	}
	
	@Override
	public int compareTo(Object o) 
	{
		Tablice_Arrays przeslany =  (Tablice_Arrays)o;
		
		if (this.getLiczba() > przeslany.getLiczba())
		{
			return 1;
		}
		
		if (this.getLiczba() < przeslany.getLiczba())	
		{
			return -1;
		}
	
		return 0;
	}
	

}
