import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class Wychowankowie extends JDialog implements pobierzCzasDoZegarka, wylaczanieOkna
{

	private JPanel contentPane;
	private JScrollPane scrollWychowankowie = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wychowankowie frame = new Wychowankowie();
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
	
	public Wychowankowie() throws Exception 
	{
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 492, 326);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("OptionPane.border"));
		setContentPane(contentPane);
		this.setTitle("Wychowankowie");
	
		WindowListener sluchaczWychowankowie = new wylaczanieOkna.zamykanieOkien();
		this.addWindowListener(sluchaczWychowankowie);
	
					File f = new File("C:\\Users\\Lenovo\\Desktop\\wychowankowie.txt");
					Properties props = new Properties();
					InputStream is = new FileInputStream(f);
					props.load(is);
					
			scrollWychowankowie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollWychowankowie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
				
				JPanel panel = new JPanel();
				panel.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
				panel.setLayout(new BorderLayout(0, 0));
				SpringLayout sl_contentPane = new SpringLayout();
				sl_contentPane.putConstraint(SpringLayout.NORTH, lCzasu, 10, SpringLayout.SOUTH, scrollWychowankowie);
				sl_contentPane.putConstraint(SpringLayout.NORTH, scrollWychowankowie, 18, SpringLayout.NORTH, contentPane);
				sl_contentPane.putConstraint(SpringLayout.WEST, scrollWychowankowie, 21, SpringLayout.WEST, contentPane);
				sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, contentPane);
				sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
				sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 11, SpringLayout.NORTH, contentPane);
				sl_contentPane.putConstraint(SpringLayout.EAST, panel, 11, SpringLayout.WEST, contentPane);
				contentPane.setLayout(sl_contentPane);
				contentPane.add(panel);
				contentPane.add(scrollWychowankowie);
				
				tablicaWychowankow = new JTable();
				tablicaWychowankow.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"Imi\u0119", "Nazwisko", "Pesel", "Urodzony", "Miejsce urodzenia", "Rodzice", "Mieszka"
					}
				));
				tablicaWychowankow.setShowVerticalLines(true);
				tablicaWychowankow.setShowHorizontalLines(true);
				tablicaWychowankow.setShowGrid(true);
				tablicaWychowankow.setFillsViewportHeight(true);
				tablicaWychowankow.setBorder(new LineBorder(new Color(10, 10, 10), 1, true));
				scrollWychowankowie.setViewportView(tablicaWychowankow);
				
						
					JButton bWroc = new JButton("Wróć");
					sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollWychowankowie, -6, SpringLayout.NORTH, bWroc);
					sl_contentPane.putConstraint(SpringLayout.EAST, scrollWychowankowie, 0, SpringLayout.EAST, bWroc);
					sl_contentPane.putConstraint(SpringLayout.NORTH, bWroc, 240, SpringLayout.NORTH, contentPane);
					sl_contentPane.putConstraint(SpringLayout.EAST, lCzasu, -60, SpringLayout.WEST, bWroc);
					sl_contentPane.putConstraint(SpringLayout.EAST, bWroc, -21, SpringLayout.EAST, contentPane);
					bWroc.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
					bWroc.setHorizontalTextPosition(SwingConstants.RIGHT);
					contentPane.add(bWroc);
					bWroc.setHorizontalAlignment(SwingConstants.RIGHT);
					
					JLabel label = new JLabel("Zegarek: ");
					sl_contentPane.putConstraint(SpringLayout.NORTH, label, 244, SpringLayout.NORTH, contentPane);
					sl_contentPane.putConstraint(SpringLayout.WEST, label, 31, SpringLayout.WEST, contentPane);
					sl_contentPane.putConstraint(SpringLayout.WEST, lCzasu, 0, SpringLayout.EAST, label);
					contentPane.add(label);
					contentPane.add(lCzasu);
					
					bWroc.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							dispose();
						}
					});
			
			
					ActionListener stoper = new ZegarCzasowy();
					Timer zegarek = new Timer(1000, stoper);
					zegarek.start();	
	}

	JLabel lCzasu = new JLabel(pobierzCzasInterface());	
	private JTable tablicaWychowankow;
	
	
	private class ZegarCzasowy implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			lCzasu.setText(pobierzCzasInterface());
		}
		
	}
}
