import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class odczytDanych 
{
	public static void main(String[] args) throws NullPointerException, Exception
	{
		File f = new File(Messages.getString("odczytDanych.0")); //$NON-NLS-1$
		Properties props = new Properties();
		InputStream is = new FileInputStream(f);
		props.load(is);
		System.out.println(props);
	}
}
