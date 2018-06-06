import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.JLabel;

public class TestWychowankowie extends JDialog implements pobierzCzasDoZegarka
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWychowankowie frame = new TestWychowankowie();
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
	String listaWychowankow;
	
	public TestWychowankowie() throws Exception 
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Wychowankowie");
				
		
					File f = new File("C:\\Users\\Lenovo\\Desktop\\wychowankowie.txt");
					Properties props = new Properties();
					InputStream is = new FileInputStream(f);
					props.load(is);
					System.out.println(props);
		
		JList list = new JList();
		list.setBounds(49, 228, 333, -189);
		contentPane.add(list);
		
		JButton wroc = new JButton("Wróć");
		wroc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Object source = e.getSource();
				
				if (source == wroc)
				{
					new RamkaWylaczania().setVisible(true);
					
				}
			}
		});
		wroc.setBounds(335, 227, 89, 23);
		contentPane.add(wroc);
		
		JLabel label = new JLabel("Zegarek: ");
		label.setBounds(23, 231, 60, 14);
		contentPane.add(label);
		
		lCzasu.setBounds(76, 231, 201, 14);
		contentPane.add(lCzasu);
		
		TablicaWychowankowie = new JTable();
		TablicaWychowankowie.setBounds(23, 205, 369, -173);
		contentPane.add(TablicaWychowankowie);

			
		 TableModel dataModel = new AbstractTableModel() {
	          public int getColumnCount() { return 10; }
	          public int getRowCount() { return 10;}
	          public Object getValueAt(int row, int col) { return new Integer(row*col); }
	      };
	      JTable table = new JTable(dataModel);
	      JScrollPane scrollpane = new JScrollPane(table);

		ActionListener stoper = new ZegarCzasowy();
		Timer zegarek = new Timer(1000, stoper);
		zegarek.start();
	}

	JLabel lCzasu = new JLabel(pobierzCzasInterface());	//poprzez dodanie interfajsu 
	private JTable TablicaWychowankowie;
	
	
	private class ZegarCzasowy implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			lCzasu.setText(pobierzCzasInterface());
		}
		
	}
}
