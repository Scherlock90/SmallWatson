import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttony extends JFrame {
	
	String nazwa;
	
	
	Buttony(String nazwa)
	{
		this.nazwa = nazwa;
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(nazwa);
		this.pack();
		
		int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
		int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		this.setSize(szerokosc / 2, wysokosc / 2);
		
		int szerRamki = this.getSize().width;
		int wysRamki = this.getSize().height;
		
		this.setLocation((wysokosc - wysRamki) / 2, (szerokosc - szerRamki)/2);
		this.przyciski();
		
	}
	
	public void przyciski()
	{
		JButton Centrum, Gora, Dol, Lewa, Prawa;	
		
		Prawa = new JButton("Adres - P");
		Lewa = new JButton("Imię - L");
		Centrum = new JButton("Nazwisko - C");
		Gora = new JButton("Miejsce Urodzenia - G");
		Dol = new JButton("Rodzice - D");
		
		Container kontener = this.getContentPane();	
		kontener.add(Prawa, BorderLayout.LINE_END);	
		kontener.add(Lewa, BorderLayout.LINE_START);
		kontener.add(Centrum, BorderLayout.CENTER);
		kontener.add(Gora, BorderLayout.PAGE_START);
		kontener.add(Dol, BorderLayout.PAGE_END);		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Buttony("Ramka z przyciskami");
		
	}

}
