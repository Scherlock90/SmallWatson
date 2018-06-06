import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ustawianieActionListenera extends JFrame 
{

	String nazwaRamki;
	JPanel panelPrzyciskow = new JPanel();

	JButton przyciskCzerwony = new JButton ("Czerwony");

	public ustawianieActionListenera(String nazwaRamki) 
	{
		this.nazwaRamki = nazwaRamki;
		this.setTitle(nazwaRamki);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(panelPrzyciskow);;

		int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
		int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(szerokosc / 2, wysokosc / 2);
		int szerRamki = this.getSize().width;
		int wysRamki = this.getSize().height;
		this.setLocation((wysokosc - wysRamki) / 2, (szerokosc - szerRamki)/2);
		
		przyciskCzerwony.addActionListener(new sluchaczKolorow(Color.RED));
		panelPrzyciskow.add(przyciskCzerwony);

		this.dodajPrzycisk("Zielony", Color.GREEN);
		this.dodajPrzycisk("Zolty", Color.YELLOW);
	}
	
	String nazwaPrzycisku2;
	
	public void dodajPrzycisk (String nazwaPrzycisku2, Color kolorPrzycisku)
	{
		JButton przycisk = new JButton(nazwaPrzycisku2);
		przycisk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelPrzyciskow.setBackground(kolorPrzycisku);
				
			}
			
		});
		panelPrzyciskow.add(przycisk);		
	}
	
	private class sluchaczKolorow implements ActionListener
	{
		Color kolorTla;
		
		public sluchaczKolorow(Color k) 
		{
			this.kolorTla = k;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			panelPrzyciskow.setBackground(kolorTla);	
		}
	}
	
	public static void main(String[] args) 
	{		
		new ustawianieActionListenera("Ramka z actionListenerem");
	}

}
