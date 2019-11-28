package simpleifelse;
import java.util.Scanner;
public class hcflcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=s.nextInt();
		System.out.print("Enter the second number:");
		int b=s.nextInt();
		int i,min = 0,max=0;
	    min=(a>b)?a:b;
		for(i=min;i>=1;i--) 
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println(i);
				break;
				
			}
		}
		max=(a<b)?a:b;
		for(i=max;i<=(a*b);i++) 
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println(i);
				break;
			}
		}
	s.close();
		}
}	
