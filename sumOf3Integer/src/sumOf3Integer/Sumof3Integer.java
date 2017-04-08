package sumOf3Integer;

import java.util.Scanner;

public class Sumof3Integer 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		boolean flag=false;
		char choice;
		int count = 0;
		do
		{
		System.out.print("enter size of Array : ");
		int sizeArr=sc.nextInt();
		int array[]=accept(sizeArr);
		display(array);
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if((array[i]+array[j]+array[k])==0)
					{
						System.out.println("Sum of[ "+array[i]+" "+array[j]+" "+array[k]+"] is Zero Found at index "+i+", "+j+", "+k);
						count++;
						flag=true;
					}
				}
			}
		}
		System.out.println("No of Count is: "+count);
		if(flag==false)
		{
			System.out.println("soryy...There is no three no which has sum of Zero....");
		}
		
		System.out.print("Do u want to continue...plzz press y : ");
		choice=sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		
		System.out.println("Program ended...");
	  
	}

	private static void display(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	private static int[] accept(int sizeArr) 
	{
		int arr[]=new int[sizeArr];
		System.out.println("Enter "+sizeArr+" Integer");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
}
