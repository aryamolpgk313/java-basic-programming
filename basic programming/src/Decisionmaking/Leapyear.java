package Decisionmaking;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);	
System.out.println("Enter the year:");
int n=s.nextInt();
if(n%4==0)
{
	System.out.println("ITS LEAP YEAR");	
}
else
{
	System.out.println("its not leap year");
}
s.close();
}

}
