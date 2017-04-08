package com.Bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
			s=s+line+" ";
		}
			
		return s;
		
	}
	
	public void display(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public int[] accept(int sizeArr) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sizeArr];
		System.out.println("Enter "+sizeArr+" Integer");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}
}
