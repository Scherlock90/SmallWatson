

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChecBoxy extends JFrame 
{
	public ChecBoxy() 
	{
		this.getContentPane();
		this.setVisible(true);
		this.setTitle("ChecBoxy");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
				int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
				int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
				this.setSize(szerokosc / 2, wysokosc / 2);
				int szerRamki = this.getSize().width;
				int wysRamki = this.getSize().height;
				this.setLocation((wysokosc - wysRamki) / 2, (szerokosc - szerRamki)/2);
		
		this.getContentPane().add(panel2, BorderLayout.CENTER);
		this.getContentPane().add(panel1, BorderLayout.NORTH);
		this.panel1.add(ChPochylony);
		this.panel1.add(ChPogrubiony);
		this.panel2.add(lEtykieta);
		
		ActionListener style = new zmienStylPrzycisku();	
		ChPogrubiony.addActionListener(style);	
		ChPochylony.addActionListener(style);
		
		lEtykieta.setFont(new Font("Monospeced", Font.PLAIN, 20));	
	}
				JPanel panel1 = new JPanel();
				JPanel panel2 = new JPanel();
				
				JLabel lEtykieta = new JLabel("Mam długie spodnie");
				
				JCheckBox ChPogrubiony = new JCheckBox("Pogrubiony");
				JCheckBox ChPochylony = new JCheckBox("Pochylony");

				
				
	class zmienStylPrzycisku implements ActionListener 	
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int wygladCzcionki = Font.PLAIN; 		
			if(ChPogrubiony.isSelected()) wygladCzcionki += Font.BOLD;	
			if(ChPochylony.isSelected()) wygladCzcionki += Font.ITALIC;
			lEtykieta.setFont(new Font(lEtykieta.getFont().getFamily(), wygladCzcionki, lEtykieta.getFont().getSize()));	
		}
	}
	
	public static void main(String[] args) 
	{
		new ChecBoxy();	
	}	
}
