package TwoDArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility 
{ 

	public String FileRead(String name) throws IOException
	{
		FileReader fr = null;
		try 
		{
			 fr=new FileReader(name);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		String line;
		String s="";
		
		while((line=br.readLine())!=null)
		{
			s=s+line;
		}
			
		return s;
		
	}
}
