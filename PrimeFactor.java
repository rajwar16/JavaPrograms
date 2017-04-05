import java.util.Scanner;
import java.util.HashSet;
class PrimeFactor
{
	public static void main(String args[])
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. ");
		int n=sc.nextInt();
		long input=n; 
		for(int i=2;i<=input;i++)
		{
			if(n%i==0)
			{
				hs.add(i);
				input=n/i;
				i--;
			}		
		}
	}
}
