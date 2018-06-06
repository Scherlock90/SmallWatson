import java.util.Random;
import java.util.Scanner;

public class TakieTam 
{
	
	
	public static void main(String [] args)
	{
		String []  words = {"Zegar", "Ołówek", "Dywan", "Parapet", "Kapcie", "Smrodek", "Kanapka", "Smalec"};
		
		Scanner scaner = new Scanner(System.in);	
		Random randomowyWybor = new Random();		
		
		int fails = 0;
		int round = 0;
		String response;		
		
		while (fails <= 3)		
		{
			// round++;
			
			String word = words[randomowyWybor.nextInt(words.length)];	
			String hashWord = word;
					
			for (int i = 0; i <round; i+= 3) 
			{
				char randomChar = hashWord.charAt(randomowyWybor.nextInt(hashWord.length()));		
				hashWord = hashWord.replace(String.valueOf(randomChar), "*");			
			}
					
			System.out.println("Twoje wylosowane słowo: " + hashWord);
			System.out.print("Podaj słowo: ");
			response = scaner.nextLine();		
			
			if(word.equalsIgnoreCase(response))	
			{
				System.out.println("Super osiągnąłeś to");
				round++; 
			}
			else
			{
				System.out.println("Zła odpowiedz");
				fails++;
			}
			
		}
		System.out.println("Koniec gry! Twoje punkty to: " + (round)); 
		
		
		
	}
	
	
}
