import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouty extends JFrame {
	
	String nazwaRamki;
	
	public Layouty(String nazwaRamki) 
	{
		this.nazwaRamki = nazwaRamki;
		this.setTitle(nazwaRamki);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
		int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
		
		this.setSize(wysokosc / 2, szerokosc / 2);
		
		int szerRamki = this.getSize().width;
		int wysRamki = this.getSize().height;
		
		this.panel_przyciskow();
		this.pack();
	}
	
	
	JPanel panelPrzyciskow = new JPanel(new FlowLayout());	
	
	public void panel_przyciskow()
	{
		JButton Nazwisko, Imie, Adres, Pesel, Rodzice;
		
		Nazwisko = new JButton("Nazwisko");
		Imie = new JButton("Imie");
		Adres =  new JButton("Adres");
		Pesel = new JButton("Pesel");
		Rodzice = new JButton("Rodzice");
				
		panelPrzyciskow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panelPrzyciskow.add(Imie).setPreferredSize(Imie.getPreferredSize());
		panelPrzyciskow.add(Nazwisko).setPreferredSize(Nazwisko.getPreferredSize()); 	
		panelPrzyciskow.add(Adres);
		panelPrzyciskow.add(Pesel);
		panelPrzyciskow.add(Rodzice);
		
		this.getContentPane().add(panelPrzyciskow, BorderLayout.CENTER); 		
	}		
	
	public static void main(String[] args) 
	{
		
		new Layouty ("Ramka z układami kompozycji przycisków");
	}

}
