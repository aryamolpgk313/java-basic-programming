package simpleifelse;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the year:");
		int year=s.nextInt();
		if(year % 4==0)
		{
		if(year % 100==0)
			{
			if(year % 400==0)
			{
				System.out.println("Leap Year");
			}	
		
	
		else
		{
			System.out.println("Not Leap Year ");
		}
	}
		else
		{
			System.out.println("Leap year");
		}
		}
		else
		{
			System.out.println("Not leap year");
		}
s.close();
	}
}


