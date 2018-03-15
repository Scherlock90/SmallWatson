package tabliczkaMnozenia;

public class tabliczkaMnozenia_proba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tworzenie setterów i getterów 
	
		Finanse Fin = new Finanse(); //tworzenie nowego obiektu
		Fin.wyplac(3);		//metoda wyplac 
		Fin.wplac(20000);	//metoda wpłać
		
		if(Fin.wyplac(2000))
			{System.out.println("jest siano");}
		else 
			{System.out.println("nie ma siana, idz do bociana");}
		
		
		System.out.println(Fin.getSaldo());	//pobieranie gettera łączącego saldo
	}
		
}
class Finanse 
{
	public Finanse()
	{
		saldo = 1000;		//podstawa salda na starcie
	}
	private int saldo;		//private ogranicza ingerencję z zewnątrz
	
	int getSaldo ()			//getter do którego powraca wartość podczas pobierania danych
	{
		return saldo;
	}
	boolean setSaldo(int saldo)		//setter starujący umożliwiający ustawiania salda dla innych obiektów funkcji, itd.
	{
		
		this.saldo = saldo;				//this -> odniesienie do obecnego oiektu salda!!
		return true;
	}
	boolean wyplac(int ile)			//metoda pozwalajaca przy ustawieniu true/false pobieranie salda
	{
		if (saldo <ile)			//int ile jest istotny!!!
			return false;
			else 
				saldo -= ile;
					return true;
	}
	boolean wplac(int ile)		//zaprzeczenie wypłac tutaj umożliwa dodawania poprzez int ile
	{
		setSaldo (saldo + ile);
		return true;
			
	}
}
