import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TestCheckBox extends JFrame 
{
	private JCheckBox chckbxPogrubiony;
	private JCheckBox chckbxPochylony;
	private JPanel contentPane;
	private JLabel lblJestemNaWypasie;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try 
				{
					TestCheckBox frame = new TestCheckBox();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestCheckBox() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ActionListener Akcja = new zmienStylPrzycisku();	
		
		
		chckbxPogrubiony = new JCheckBox("Pogrubiony");
		chckbxPogrubiony.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxPogrubiony.addActionListener(Akcja);	
		chckbxPogrubiony.setToolTipText("Pogrubia Text");
		chckbxPogrubiony.setBounds(73, 7, 79, 23);
		contentPane.add(chckbxPogrubiony);
		
		chckbxPochylony = new JCheckBox("Pochylony");
		chckbxPochylony.addActionListener(Akcja);		
		chckbxPochylony.setToolTipText("Pochyla Text");
		chckbxPochylony.setBounds(169, 7, 75, 23);
		contentPane.add(chckbxPochylony);
		
		lblJestemNaWypasie = new JLabel("JEstem na wypasie");
		lblJestemNaWypasie.setBounds(84, 49, 153, 23);
		contentPane.add(lblJestemNaWypasie);
		lblJestemNaWypasie.setFont(new Font("Monospaced", Font.PLAIN, 15));
	}
	
	
	public class zmienStylPrzycisku implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int style = Font.PLAIN;
			if(chckbxPochylony.isSelected()) style += Font.ITALIC;
			if(chckbxPogrubiony.isSelected()) style += Font.BOLD;
			
			lblJestemNaWypasie.setFont(new Font(lblJestemNaWypasie.getFont().getFamily(), style, lblJestemNaWypasie.getFont().getSize()));
		}
	}
}
