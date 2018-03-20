package noweOtwarcie;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Farenhait extends JFrame implements ActionListener {
	
	private JTextField tCelcjusz, tFarenhait;
	private JLabel lCelcjusz, lFarenhait;
	private JButton bKonwertuj;
	private ButtonGroup bgRozmiar, radioPanel;
	private JRadioButton rbMały, rbŚredni, rbDuży, rbCtoF, rbFtoC;
	private double tempCelcjusz, tempFarenhait;
	private JCheckBox ChWielkie;
		
	public Farenhait() {
		
				
		setSize(400,400);
		setTitle("Przeliczanie z Farenhaita na Celcjusza");
		setLayout(null);
		
		lCelcjusz = new JLabel ("Stopnie Celcjusza:");
		lCelcjusz.setBounds(40,20,200,20);
		add(lCelcjusz);
		
		lFarenhait = new JLabel ("Stopnie Farenhaita:");
		lFarenhait.setBounds(40,80,200,20);
		add(lFarenhait);
		
		
		tCelcjusz = new JTextField("");
		tCelcjusz.setBounds(100,40,100,20);
		add(tCelcjusz);
		tCelcjusz.addActionListener(this);
		
		tFarenhait = new JTextField("");
		tFarenhait.setBounds(100,100,100,20);
		add(tFarenhait);
		tFarenhait.addActionListener(this);
		
		bKonwertuj = new JButton("Konwerter");
		bKonwertuj.setBounds(40,140,100,20);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
		ChWielkie = new JCheckBox("Wielkie Litery");
		ChWielkie.setBounds(160,140,100,20);
		add(ChWielkie);
		 ChWielkie.addActionListener(this);
		
		bgRozmiar = new ButtonGroup();
		rbMały = new JRadioButton("Mały", true);
		rbMały.setBounds(20, 180, 100, 20);
		bgRozmiar.add(rbMały);
		add(rbMały);
		rbMały.addActionListener(this);
		
		rbŚredni = new JRadioButton("Średni", true);
		rbŚredni.setBounds(100, 180, 100, 20);
		bgRozmiar.add(rbŚredni);
		add(rbŚredni);
		rbŚredni.addActionListener(this);
		
		rbDuży = new JRadioButton("Duży", true);
		rbDuży.setBounds(200, 180, 100, 20);
		bgRozmiar.add(rbDuży);
		add(rbDuży);
		rbDuży.addActionListener(this);
		
		rbCtoF = new JRadioButton("Z Celciusza na Farenhaita");
		rbCtoF.setBounds(40,220,100,20);
		add(rbCtoF);
		rbCtoF.setSelected(true);
		
		rbFtoC = new JRadioButton("Z Farenhaita na Celciusza");
		rbFtoC.setBounds(150,220,100,20);
		add(rbFtoC);
		
				
		radioPanel = new ButtonGroup();
		radioPanel.add(rbCtoF);
		radioPanel.add(rbFtoC);
		radioPanel.add(rbMały);
		radioPanel.add(rbŚredni);
		radioPanel.add(rbDuży);
		
				
	}
	public static void main(String[] args) {
		Farenhait aplikacja = new Farenhait();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent CF) {
		Object source = CF.getSource();
		
		if (source == bKonwertuj) {
		
			if (rbCtoF.isSelected())
			{
			// TODO Auto-generated method stub
			tempCelcjusz = Double.parseDouble(tCelcjusz.getText());
			tempFarenhait = 32.0 + (9.0/5.0) * tempCelcjusz;
			tFarenhait.setText(String.valueOf(tempFarenhait));
			}
				else if (rbFtoC.isSelected())
				{
					tempFarenhait = Double.parseDouble(tFarenhait.getText());
					tempCelcjusz = (tempFarenhait - 32) * (5.0/9.0);
					tCelcjusz.setText(String.valueOf(tempCelcjusz));
				}
			}
		if (source == tCelcjusz)
		{
			// TODO Auto-generated method stub
			tempCelcjusz = Double.parseDouble(tCelcjusz.getText());
			tempFarenhait = 32.0 + (9.0/5.0) * tempCelcjusz;
			tFarenhait.setText(String.valueOf(tempFarenhait));
			
		}
			else if (source == tFarenhait) 
			{
			tempFarenhait = Double.parseDouble(tFarenhait.getText());
			tempCelcjusz = (tempFarenhait - 32) * (5.0/9.0);
			tCelcjusz.setText(String.valueOf(tempCelcjusz));
			}
		
			
		if (source == rbMały) {
				
				 tFarenhait.setFont(new Font("SanSerif", Font.PLAIN, 12));
			}
			else if   (source == rbŚredni) {
				 tFarenhait.setFont(new Font("SanSerif", Font.ITALIC, 16));
			 }
			else if (source == rbDuży) {
				 tFarenhait.setFont(new Font("SanSerif", Font.CENTER_BASELINE, 20));
			 }
			else if (source == ChWielkie) {
			
		if (ChWielkie.isSelected()==true) {
			
				tFarenhait.setFont(new Font("SanSerif", Font.BOLD, 22));
				}
		else if (ChWielkie.isSelected()==false) {
			tFarenhait.setFont(new Font("SanSerif", Font.PLAIN, 12));
				}
			}
		
		}
	}
	
	
	

