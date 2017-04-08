import java.util.Scanner;
import java.lang.*;
class Anagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String: ");
		String str1=sc.next();
		
		System.out.print("Enter Second String: ");
		String str2=sc.next();

		char charstr1[]=str1.toCharArray();
		char charstr2[]=str2.toCharArray();
		
		char sortString1[]=sort(charstr1);
		char sortString2[]=sort(charstr2);
		
		for(int i=0;i<5;i++)
		{
			System.out.print(sortString[i]);
		}
}
	
	public static String sort(char[] a)
	{
		char temp;
		for(int  i=0;i<5;i++)
		{
			if(a[i].compareTo( a[i+1] )<0)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
		}
	}
}
