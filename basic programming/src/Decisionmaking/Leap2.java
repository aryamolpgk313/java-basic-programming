package Decisionmaking;
import java.util.Scanner;
public class Leap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the year:");
		int n=s.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
			
				System.out.println("ITS LEAP YEAR");	
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
			else
				{
					System.out.println("ITS LEAP YEAR");
				}
		}
		else
				{
					System.out.println("ITS not a LEAP YEAR");
				}
		s.close();
	    	}
		
		
	}

		

	


