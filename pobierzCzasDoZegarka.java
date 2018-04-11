import java.util.Calendar;
import java.util.GregorianCalendar;

public interface pobierzCzasDoZegarka 
{
	default String pobierzCzasInterface() 
	{
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
		return h + " : " + min +" : " + sec + "  Dzień " + dzienTegoRoku + " dzień tego roku.";
	};
}
