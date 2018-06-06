import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Tworzenie_Ramki extends JFrame
{	
	String nazwa;
	
	public Tworzenie_Ramki(String nazwa) 
	{
		this.nazwa = nazwa;
		
		//JFrame tR = new JFrame("RamkaNowa");	//pierwsza metoda tworzenia ramki
		
		//tR.setIconImage(Toolkit.getDefaultToolkit().getImage("sss.jpg"));
		//tR.setVisible(true);
		//tR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tR.setBounds(200, 200, 300, 300);
		//tR.setTitle("Ramka23040");
		//tR.createImage(100, 100);
		
		//druga metoda tworzenia ramki
		
		int szer = Toolkit.getDefaultToolkit().getScreenSize().width;	//domyslny zestaw narzedzi. rozszerzony o getter rozmiaru ekrany. rozszerzony o szerokosc
		int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;	//Analogicznie z wysokoscia
		
		//System.out.println(wysokosc); System.out.print(szer);
		
		this.setSize(szer/2, wysokosc/2);	//setter rozmiarów szerokosci, wysokosci
		//this.setLocation(szer/ 4, wysokosc /4);	//to nie jest uniwersalna formuła
		
		int szer1 = this.getSize().width;	//getter szerokosci
		int wysokosc1 = this.getSize().height;	//getters wysokosci
		
		this.setLocation((szer - szer1)/2, (wysokosc - wysokosc1)/2);	//uniwersalna forma utawiania lokcalizacji do każdej rozdzielczości montiora
		
		//this.setBounds(300, 300, 300, 200);	//umozliwiło mi odnoszenie się do właściwosci/metod dzieki rozszerzeniu o Jframe
		this.setVisible(true);	//ramka ustawiona w booleanie na true powoduje widoczność okienka
		this.setTitle("Ramka23050");	//tytuł ramki 
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Tworzenie_Ramki("NowaRamka");	//konstruktor klasy Tworzenie_Ramki
		
	}

}
