import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public interface wylaczanieOkna
{
	public class zamykanieOkien extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			
			int answer = JOptionPane.showConfirmDialog(null, "Zamknąć program?", null, JOptionPane.YES_NO_OPTION);
			
			if (answer == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			
		}
	}
}
