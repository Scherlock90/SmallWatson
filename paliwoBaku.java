package tabliczkaMnozenia;

public class paliwoBaku {

	private double paliwo;
	int km;
	
	
	paliwoBaku (double paliwo)
	{
		this.paliwo = paliwo;
	}
	double getPaliwo()
	{
		return paliwo;
	}
	boolean wlejPaliwo ()
	{
		this.paliwo = paliwo;
		if(km < 25)
		{
			paliwo += 1;
		}
		else if (km <50)
			paliwo += 2;
		else if (km> 50 || km <= 100)
			paliwo += 5;
		else
			paliwo += 0;
		
		return true;
					
	}
	boolean zuzyte (int km)
	{
		this.paliwo = paliwo;
		if (km < 25)
		{
			paliwo -= 1;
		}
		else if (km <50)
		{
			paliwo -= 2;
		}
		else if (km> 50)
		{
			paliwo -= 5;
		}
		else
		{
			paliwo -= 0;
		}
		return true;
		
	}
	boolean uzupelnijPaliwo (int km, paliwoBaku uzupelnij) 
	{	
		this.km = km;
		if (km <50)
		{
			uzupelnij.wlejPaliwo();
		}
		else if (km > 50)
		{
			uzupelnij.wlejPaliwo();
		}
		else
		{
			uzupelnij.wlejPaliwo();
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paliwoBaku[] bB = new paliwoBaku[4];
		
		bB [0] = new paliwoBaku(10);
		bB [1] = new paliwoBaku(10);
		bB [2] = new paliwoBaku(10);
		bB [3] = new paliwoBaku(10);
		
		
		bB [0].zuzyte(49);
		//bB [1].zuzyte(99);
		bB [2].zuzyte(77);
		bB [3].zuzyte(12);
		
		bB [0].uzupelnijPaliwo(44, bB [0]);
		bB [1].uzupelnijPaliwo(22, bB [1]);
		
		System.out.println(bB [0].getPaliwo());
		System.out.println(bB [1].getPaliwo());
		System.out.println(bB [2].getPaliwo());
		System.out.println(bB [3].getPaliwo());
		
		//System.out.println(bB[0].wlejPaliwo(6), bB[1].wlejPaliwo(5), bB[2].wlejPaliwo(7),  bB[1].wlejPaliwo(8));
		

	}

}
