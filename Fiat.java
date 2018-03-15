package dziedziczonkoProtected_modyfikator;
import dziedziczenie.Auta;		//aby w innym pakunku korzystać z zawartości innego package wówczas musimy importować go tutaj

public class Fiat extends Auta {		//dzięki extends mam dostep do klasy Auta, bo taką wybraliśmy i do jej zawartości o ile nie jest ona private
	
	public void fiacik()
	{
		this.predkosc = 0;		//tu odniosłem się do właściwości (protected) prędkości z klasy Auta zawartej w pakunku dziedzienie
	}
	@Override
	protected void opis()
	{
		
	}
}




//Ta klasa powstała wyłącznie by zobaczyć jak można używać modyfikatora protected i jak można połączyć import, extends z innego pakunku i klasy