import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FocusListener_KeyListener_GridLayout_VirutalKeys extends JFrame
{
	public FocusListener_KeyListener_GridLayout_VirutalKeys() 
	{
		inicjalizacja();
	}
	public void inicjalizacja()
	{	
			this.setTitle(" FocusListener_KeyListener_GridLayout_VirutalKeys");
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);			
			
			kontener.add(panelPrzyciskow);
			panelPrzyciskow.setLayout(new GridLayout(3,1));
			panelPrzyciskow.add(przycisk1);
			panelPrzyciskow.add(przycisk2);
			panelPrzyciskow.add(przycisk3);
			
			int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
			int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
			this.setSize(szerokosc / 2, wysokosc / 2);
			int szerRamki = this.getSize().width;
			int wysRamki = this.getSize().height;
			this.setLocation((wysokosc - wysRamki) / 2, (szerokosc - szerRamki)/2);
	
	}
	
	private Container kontener = this.getContentPane();
	JPanel panelPrzyciskow = new JPanel();
	private zmienPrzycisk przycisk1 = new zmienPrzycisk("Dodaj");
	private zmienPrzycisk przycisk2 = new zmienPrzycisk("Zmien");
	private zmienPrzycisk przycisk3 = new zmienPrzycisk("Usun");
	
	
	private class zmienPrzycisk extends JButton implements FocusListener, ActionListener
	{
	
			public zmienPrzycisk(String nazwa)
		{
				super(nazwa);	
				this.addActionListener(this);
				this.addFocusListener(this);		 
				this.addKeyListener(new KeyAdapter() 
				{	
					@Override
					public void keyPressed(KeyEvent a) 
					{
						keyPressedHandler(a);	
					}
				});
		}
		@Override
		public void focusGained(FocusEvent e) 
		{
			this.setBackground(kFocusGained);	
		}
		@Override
		public void focusLost(FocusEvent e) 
		{
			this.setBackground(kolorPodstawowy);		
		}

		public void keyPressedHandler(KeyEvent a)		
		{
			int dlMenu = panelPrzyciskow.getComponentCount();	
			
			if(ink == 0) 
				ink = 10*dlMenu;		
			if(a.getKeyCode() == KeyEvent.VK_DOWN)	
			{
				panelPrzyciskow.getComponent(++ink%dlMenu).requestFocus();		
			}
			else if(a.getKeyCode() == KeyEvent.VK_UP)
			{
				panelPrzyciskow.getComponent(--ink%dlMenu).requestFocus();
			}
			else if(a.getKeyCode() == KeyEvent.VK_ENTER)
			{
//				zmienPrzycisk tmp = (zmienPrzycisk)a.getSource();	
//				tmp.doClick();
			
//				Object abc = a.getSource();		
//				this.doClick();
				
				((zmienPrzycisk)a.getSource()).doClick();		
			}
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//System.out.print("Coś tam się stało");
			//JOptionPane.showMessageDialog(this, "Kałabanga");	
			JOptionPane.showMessageDialog(this, ((zmienPrzycisk)e.getSource()).getText()); 
		}
		
		private int ink = 0;		 
		private Color kFocusGained = Color.RED;		
		private Color kolorPodstawowy = Color.BLUE;	
	}
	
	public static void main(String[] args) 
	{
		new  FocusListener_KeyListener_GridLayout_VirutalKeys().setVisible(true);

	}

}
