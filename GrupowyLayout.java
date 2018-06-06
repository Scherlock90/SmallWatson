import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GrupowyLayout extends JFrame {

	String nazwaLayoutu;
	
	GrupowyLayout(String nazwaLayoutu)
	{
		this.nazwaLayoutu = nazwaLayoutu;
		this.setTitle(nazwaLayoutu);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
		int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		this.setSize(szerokosc / 2, wysokosc / 2);
		
		int szerRamki = this.getSize().width;
		int wysRamki = this.getSize().height;
		
		this.setLocation((szerokosc - szerRamki) /2, (wysokosc - wysRamki)/2);
		
		this.panelPrzyciskow();
		pack();
		
	}
	
	JPanel panelPrzyciskow2 = new JPanel();
	JPanel panelTextowy = new JPanel();

		Color tla;
		String nazwaPrzycisku, opisPrzycisku;
	
	public void dodajPrzyciskiKolorowe(String nazwaPrzycisku, String opisPrzycisku, Color tla)
	{
		JButton przyciski = new JButton(nazwaPrzycisku);
		przyciski.setToolTipText(opisPrzycisku);
		
		przyciski.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelPrzyciskow2.setBackground(tla);
				
			}
			
		});
		
		panelPrzyciskow2.add(przyciski);
		
	}
	
	JTextField textWychowawcy;
	String wychProwadzacy = new String ("Rzepko " + "Pryzmont");
	
	
	
	public void przyciskiW (String nazwaPrzycisku, String opisPrzycisku)
	{
		JButton przyciskiW = new JButton(nazwaPrzycisku);
		przyciskiW.setToolTipText(opisPrzycisku);
		
		
		textWychowawcy = new JTextField();
		textWychowawcy.setBounds(100,150, 50, 500);
		
		panelPrzyciskow2.add(textWychowawcy);
		
		przyciskiW.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent eE) 
			{
				
				Object source = eE.getSource();
				//eE.setSource(przyciskiW);
				
				if(source == przyciskiW)
				{
					textWychowawcy.getText();
					textWychowawcy.setText(wychProwadzacy);	
				}				
			}
		});
		
		panelPrzyciskow2.add(przyciskiW);
		panelTextowy.add(textWychowawcy);		
	}
		
	public void panelPrzyciskow ()
	{
		JButton Wychowawca, Wychowankowie, Ulica, NrDomu, bAnuluj;
		
		this.dodajPrzyciskiKolorowe("Czarny", "Daje tło Czarne", Color.BLACK);
		this.dodajPrzyciskiKolorowe("Szary", "Daje kolor tła szary", Color.LIGHT_GRAY);
		this.dodajPrzyciskiKolorowe("Czerwony", "Daje kolor tla czerwony", Color.RED);
		this.przyciskiW("Wychowawcy", "Wychowawcy prowadzący");
		
		bAnuluj = new JButton("Anuluj");
	
//		Wychowawca.setToolTipText("Wychowawcy prowadzący");
//		Wychowankowie.setToolTipText("Dane wychowanka");
//		Ulica.setToolTipText("Wyświetli ulicę wychowanka");
//		NrDomu.setToolTipText("Wyświetli numer domu wychowanka");
		bAnuluj.setToolTipText("Nie naciskaj bo wyłączysz");
				
		
		GroupLayout grupowyL = new GroupLayout(getContentPane());	
		
		this.getContentPane().setLayout(grupowyL);	
		grupowyL.setAutoCreateContainerGaps(true);
		grupowyL.setAutoCreateGaps(true);
		
		
		grupowyL.setHorizontalGroup(	
				grupowyL.createSequentialGroup()
				.addComponent(panelPrzyciskow2)
				.addComponent(textWychowawcy)
				.addContainerGap(10, Short.MAX_VALUE)	
				.addComponent(bAnuluj)
				);
		grupowyL.setVerticalGroup(		
				grupowyL.createSequentialGroup()	
				.addComponent(panelPrzyciskow2)
				.addContainerGap(10, Short.MAX_VALUE)
				.addComponent(textWychowawcy)			
				.addContainerGap(10, Short.MAX_VALUE)	
				.addComponent(bAnuluj)
				);	
	}	

	public static void main(String[] args) {
		new GrupowyLayout("Ramka z GrupowyLayoutem");
	}

}
