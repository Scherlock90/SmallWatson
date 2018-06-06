import javax.swing.JFrame;

public class TestRamka extends JFrame 
{

	String nazwaRamki;
	
	TestRamka(String nazwaRamki)
	{
		this.setTitle(nazwaRamki);
		this.nazwaRamki = nazwaRamki;
		
		
		int szerokosc = this.getToolkit().getScreenSize().width;	
		int wysokosc = this.getToolkit().getScreenSize().height;	
		
		this.setSize(szerokosc / 2, wysokosc/2);	
		
		int szerRamki = this.getSize().width;
		int wysRamki = this.getSize().height;
		
		this.setLocation((szerokosc-szerRamki)/2, (wysokosc-wysRamki)/2);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		TestRamka tS = new TestRamka ("Ramka domyślna");
		System.out.println(tS);
		
	}

}
