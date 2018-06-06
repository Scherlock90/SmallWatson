import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;

public class Kalendarz2 extends JDialog 
{

	private final JPanel contentPanel = new JPanel();
	private final JPanel panel = new JPanel();
	private JButton button_1;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_26;
	private JButton button_28;
	private JButton button_29;
	private JButton button;
	private JButton button_7;
	private JButton button_11;
	private JButton button_2;
	private JButton button_15;
	private JButton button_27;
	private JButton button_30;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblDnityg;
	private JLabel lblI;
	private JLabel lblIi;
	private JLabel lblIii;
	private JLabel lblIv;
	private JLabel lblV;
	private JLabel lblPoniedziaek;
	private JLabel lblWtorek;
	private JLabel lblSroda;
	private JLabel lblCzwartek;
	private JLabel lblPitek;
	private JLabel lblSobota;
	private JLabel lblNiedziela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		try {
			Kalendarz2 dialog = new Kalendarz2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Kalendarz2() 
	{
		setBounds(100, 100, 404, 332);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			button_21 = new JButton("1");
			buttonGroup.add(button_21);
			contentPanel.add(panel, BorderLayout.NORTH);
		}
		{
			button_22 = new JButton("17");
			buttonGroup.add(button_22);
		}
		panel.setLayout(new FormLayout(new ColumnSpec[] 
				{
				ColumnSpec.decode("max(46dlu;pref)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.PREF_COLSPEC,
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				FormSpecs.PREF_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.MIN_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.MIN_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(29dlu;min)"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("-3px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		{
			lblDnityg = new JLabel("Dni/Tyg.");
			panel.add(lblDnityg, "1, 2, center, center");
		}
		{
			lblI = new JLabel("I");
			panel.add(lblI, "3, 2, center, center");
		}
		{
			lblIi = new JLabel("II");
			panel.add(lblIi, "5, 2, center, center");
		}
		{
			lblIii = new JLabel("III");
			panel.add(lblIii, "7, 2, center, center");
		}
		{
			lblIv = new JLabel("IV");
			panel.add(lblIv, "9, 2, center, center");
		}
		{
			lblV = new JLabel("V");
			panel.add(lblV, "11, 2, center, center");
		}
		{
			lblPoniedziaek = new JLabel("Poniedziałek");
			panel.add(lblPoniedziaek, "1, 4, center, center");
		}
		panel.add(button_21, "3, 4, fill, fill");
		{
			button_11 = new JButton("8");
			buttonGroup.add(button_11);
			panel.add(button_11, "5, 4, fill, fill");
		}
		{
			button_10 = new JButton("15");
			buttonGroup.add(button_10);
		}
		panel.add(button_10, "7, 4, fill, fill");
		{
			button_14 = new JButton("22");
			buttonGroup.add(button_14);
		}
		panel.add(button_14, "9, 4, fill, fill");
		{
			button_5 = new JButton("29");
			buttonGroup.add(button_5);
		}
		panel.add(button_5, "11, 4, fill, fill");
		{
			button_20 = new JButton("9");
			buttonGroup.add(button_20);
		}
		{
			button_6 = new JButton("2");
			buttonGroup.add(button_6);
		}
		{
			lblWtorek = new JLabel("Wtorek");
			panel.add(lblWtorek, "1, 6, center, center");
		}
		panel.add(button_6, "3, 6, fill, fill");
		panel.add(button_20, "5, 6, fill, fill");
		{
			button_19 = new JButton("16");
			buttonGroup.add(button_19);
		}
		panel.add(button_19, "7, 6, fill, fill");
		{
			button_27 = new JButton("23");
			buttonGroup.add(button_27);
			panel.add(button_27, "9, 6, fill, fill");
		}
		{
			button_13 = new JButton("30");
			buttonGroup.add(button_13);
		}
		panel.add(button_13, "11, 6, fill, fill");
		{
			button_17 = new JButton("3");
			buttonGroup.add(button_17);
		}
		{
			lblSroda = new JLabel("Środa");
			panel.add(lblSroda, "1, 8, center, center");
		}
		panel.add(button_17, "3, 8, fill, fill");
		{
			button_25 = new JButton("10");
			buttonGroup.add(button_25);
		}
		panel.add(button_25, "5, 8, fill, fill");
		panel.add(button_22, "7, 8, fill, fill");
		{
			button_12 = new JButton("24");
			buttonGroup.add(button_12);
		}
		panel.add(button_12, "9, 8, fill, fill");
		{
			button_16 = new JButton("31");
			buttonGroup.add(button_16);
		}
		panel.add(button_16, "11, 8, fill, fill");
		{
			button_29 = new JButton("4");
			buttonGroup.add(button_29);
		}
		{
			lblCzwartek = new JLabel("Czwartek");
			panel.add(lblCzwartek, "1, 10, center, center");
		}
		panel.add(button_29, "3, 10, fill, fill");
		{
			button_26 = new JButton("11");
			buttonGroup.add(button_26);
		}
		panel.add(button_26, "5, 10, fill, fill");
		{
			button = new JButton("25");
			buttonGroup.add(button);
		}
		{
			button_3 = new JButton("18");
			buttonGroup.add(button_3);
		}
		panel.add(button_3, "7, 10, fill, fill");
		panel.add(button, "9, 10, fill, fill");
		{
			button_9 = new JButton("5");
			buttonGroup.add(button_9);
		}
		{
			lblPitek = new JLabel("Piątek");
			panel.add(lblPitek, "1, 12, center, center");
		}
		panel.add(button_9, "3, 12, fill, fill");
		{
			button_28 = new JButton("12");
			buttonGroup.add(button_28);
		}
		panel.add(button_28, "5, 12, fill, fill");
		{
			button_24 = new JButton("19");
			buttonGroup.add(button_24);
		}
		panel.add(button_24, "7, 12, fill, fill");
		{
			button_4 = new JButton("26");
			buttonGroup.add(button_4);
		}
		panel.add(button_4, "9, 12, fill, fill");
		{
			button_8 = new JButton("6");
			buttonGroup.add(button_8);
		}
		{
			lblSobota = new JLabel("Sobota");
			panel.add(lblSobota, "1, 14, center, center");
		}
		panel.add(button_8, "3, 14, fill, fill");
		{
			button_2 = new JButton("13");
			buttonGroup.add(button_2);
			panel.add(button_2, "5, 14, fill, fill");
		}
		{
			button_15 = new JButton("20");
			buttonGroup.add(button_15);
			panel.add(button_15, "7, 14, fill, fill");
		}
		{
			button_18 = new JButton("27");
			buttonGroup.add(button_18);
		}
		panel.add(button_18, "9, 14, fill, fill");
		{
			lblNiedziela = new JLabel("Niedziela");
			panel.add(lblNiedziela, "1, 16, center, center");
		}
		{
			button_7 = new JButton("7");
			buttonGroup.add(button_7);
			panel.add(button_7, "3, 16, fill, fill");
		}
		{
			button_1 = new JButton("14");
			buttonGroup.add(button_1);
		}
		panel.add(button_1, "5, 16, fill, fill");
		{
			button_23 = new JButton("21");
			buttonGroup.add(button_23);
		}
		panel.add(button_23, "7, 16, fill, fill");
		{
			button_30 = new JButton("28");
			buttonGroup.add(button_30);
			panel.add(button_30, "9, 16, fill, fill");
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				buttonGroup.add(okButton);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				buttonGroup.add(cancelButton);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
