import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JTextArea;

public class Wychowawcy extends JDialog implements pobierzCzasDoZegarka {

	private JPanel contentPane;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wychowawcy frame = new Wychowawcy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	private String nazwiskaWychowawcow;
	
	public Wychowawcy() 
	{
		
		ActionListener stoper = new Zegar12();		//poprzez klasę można dodać czas
		Timer zegar12 = new Timer(1000, stoper);
		zegar12.start();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Wychowawcy prowadzący");
		
		JButton bWroc = new JButton("Wróć");
		bWroc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Object source = e.getSource();
				
				if(source == bWroc)
				{
					new RamkaWylaczania().setVisible(true);
				}
			}
		});
		bWroc.setBounds(335, 227, 89, 23);
		contentPane.add(bWroc);
		
		JButton btnPryzmont = new JButton("Pryzmont");
		btnPryzmont.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent p) 
			{
				Object source = p.getSource();
				
				if(source == btnPryzmont)
				{
					
				}
			}
		});
		btnPryzmont.setBounds(10, 25, 89, 23);
		contentPane.add(btnPryzmont);
		
		JButton btnRzepko = new JButton("Rzepko");
		btnRzepko.setBounds(10, 59, 89, 23);
		contentPane.add(btnRzepko);
		
		JButton btnNapora = new JButton("Napora");
		btnNapora.setBounds(10, 92, 89, 23);
		contentPane.add(btnNapora);
		
		JButton btnGrochowska = new JButton("Grochowska");
		btnGrochowska.setBounds(10, 124, 89, 23);
		contentPane.add(btnGrochowska);
		
		JButton btnAndrukiewicz = new JButton("Andrukiewicz");
		btnAndrukiewicz.setBounds(10, 158, 89, 23);
		contentPane.add(btnAndrukiewicz);
		
		JButton btnZieziulewicz = new JButton("Zieziulewicz");
		btnZieziulewicz.setBounds(10, 192, 89, 23);
		contentPane.add(btnZieziulewicz);
		
		JLabel lblZegarek = new JLabel("Zegarek: ");
		lblZegarek.setBounds(15, 231, 100, 14);
		lblCzas.setBounds(75,231,157,14);
		
				
		contentPane.add(lblZegarek);
		contentPane.add(lblCzas);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(119, 46, 282, 149);
		contentPane.add(textArea);
		
		JButton btnKalendarz = new JButton("Kalendarz");
		btnKalendarz.setBounds(236, 227, 89, 23);
		contentPane.add(btnKalendarz);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{bWroc, btnPryzmont, btnRzepko, btnNapora, btnGrochowska, btnAndrukiewicz, btnZieziulewicz}));
	}


	JLabel lblCzas = new JLabel();
	
	
	private class Zegar12 implements ActionListener
	{
		//JLabel lZegarek = new JLabel("Zegarek: ");
		//JLabel lCzas = new JLabel();
		
		@Override		//można poprzez clasę dodać zegarek
		public void actionPerformed(ActionEvent e) 
		{
			
			//System.out.println(iI++);
			GregorianCalendar kalendarz = new GregorianCalendar();
			
			String h = "" + kalendarz.get(Calendar.HOUR_OF_DAY);
			String min = "" +kalendarz.get(Calendar.MINUTE);
			String sec = "" + kalendarz.get(Calendar.SECOND);
			String dzienTegoRoku = "" + kalendarz.get(Calendar.DAY_OF_YEAR);
			
			
			if(Integer.parseInt(h) < 10)
			{
				h = "0" + h;
			}
			if(Integer.parseInt(min) < 10)
			{
				min = "0" + min;
			}
			if(Integer.parseInt(sec) < 10)
			{
				sec = "0" + sec;
			}
			
			
			lblCzas.setText("" + h + ":" + min + ":" + sec + "\n" +" Mamy:  " + dzienTegoRoku + " dzień.");
			lblCzas.getText();
		}
	}
}




