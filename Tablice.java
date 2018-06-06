import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.event.ContainerListener;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;

public class Tablice extends NullPointerException 
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablice window = new Tablice();
					window.frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablice() 
	{
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		BorderLayout borderLayout = (BorderLayout) frame.getContentPane().getLayout();
		borderLayout.setVgap(10);
		borderLayout.setHgap(10);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panelScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelScroll.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Wychowankowie", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panelScroll);
		panel.add(tableWychowankowie);
		initialize();

		panelScroll.setViewportView(tableWychowankowie);
		
		tableWychowankowie = new JTable();
		panelScroll.setViewportView(tableWychowankowie);
		tableWychowankowie.setShowVerticalLines(true);
		tableWychowankowie.setShowHorizontalLines(true);
		tableWychowankowie.setShowGrid(true);
		tableWychowankowie.setModel(new DefaultTableModel
				(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Imie", "Nazwisko", "data urodzenia", "Rodzice", "Miejscowość"
			}
		));
				
	}
	JPanel panel = new JPanel();
	JScrollPane panelScroll = new JScrollPane();
	private JTable tableWychowankowie;
	
	

	public JTable getTableWychowankowie() 
	{
		return tableWychowankowie;
	}
}
