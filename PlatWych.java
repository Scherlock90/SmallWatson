import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimerTask;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class PlatWych extends JFrame implements pobierzCzasDoZegarka
{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlatWych window = new PlatWych();
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
	public PlatWych() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	String wychowawcyProwadzacy = new String ("Pryzmont");
	
	
	private void initialize() {
		frame = new JFrame("Platforma Wychowania");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new zamykanieApki());
				
		
		JToolBar toolBar = new JToolBar();
		
		JButton bWychowawcy = new JButton("Wychowawcy");
		bWychowawcy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				
				if(source == bWychowawcy)
				{
					new Wychowawcy().setVisible(true);
				}
				
			}
			
		});
		
		
//		WindowListener sluchacz = new zamykanieApki();
//        this.addWindowListener(sluchacz);
                        
		JButton Wyloguj = new JButton("Wyloguj");
		Wyloguj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Object source = e.getSource();
				if (source == Wyloguj)
				{
					frame.dispose();
				}
			}
		});
		
		JButton Wychowankowie = new JButton("Wychowankowie");
		Wychowankowie.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Wychowankowie().setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		textField = new JTextField();
		textField.setVisible(false);
//		textField.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent arg0) 
//			{
//				
//			}
//		});
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setVisible(false);
		
		
		
		
		
		// --------------------------------------------------------
		ActionListener stoper = new Zegar1();
		Timer zegar = new Timer(1000, stoper);
		zegar.start();
		
		JButton bRodzice = new JButton("Rodzice");
		
		JButton btnKalendarz = new JButton("Kalendarz");
		
		JButton btnAdministracja = new JButton("Administracja");
		
		
		
		//---------------------------------------------------------
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnKalendarz, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(bRodzice, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(bWychowawcy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Wychowankowie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(28)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
									.addGap(22)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(lZegarek)
							.addComponent(lCzas)
							.addPreferredGap(ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
							.addComponent(Wyloguj)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bWychowawcy)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(Wychowankowie)
									.addGap(13)
									.addComponent(bRodzice)
									.addGap(12)
									.addComponent(btnKalendarz))
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lZegarek)
								.addComponent(lCzas)))
						.addComponent(Wyloguj))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
	}
	
	private class zamykanieApki extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			
			int answer = JOptionPane.showConfirmDialog(frame, "Zamknąć program?", null, JOptionPane.YES_NO_OPTION);
			
			if (answer == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
		}
		
		
	}
	
	
	JLabel lZegarek = new JLabel("Zegarek: ");
	JLabel lCzas = new JLabel(pobierzCzasInterface());
	
	private class Zegar1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			lCzas.setText(pobierzCzasInterface());
			//System.out.println(iI++);
			
			
			//lCzas.setText("" + h + ":" + min + ":" + sec + "\n" +" Mamy:  " + dzienTegoRoku + " dzień tego roku." );
			
		}		
	}
}
