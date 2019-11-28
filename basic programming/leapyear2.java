package simpleifelse;
import java.util.Scanner;
public class leapyear2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the year:");
    int year=s.nextInt();
    if((year % 4==0 && year % 100!=0)||(year % 400 ==0))
    {
    	System.out.println("Leap Year");
    }
    else
    {
    	System.out.println("Not leap year");
    }
    s.close();
	}

}
