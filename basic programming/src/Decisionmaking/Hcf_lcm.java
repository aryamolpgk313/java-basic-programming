package Decisionmaking;

import java.util.Scanner;

public class Hcf_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the Two Numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int min;int i;int gcd = 0;
		int max;int lcm=0;
		min=(a<b)?a:b;
		max=(a>b)?a:b;
		for(i=min;i>0;i--)
		{
			if(a%i==0 && b%i==0)
				gcd=i;
			break;
		}
		System.out.println("gcd:"+gcd);
		for(i=max;i<=(a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
		lcm=i;
			break;
		}
		}
			System.out.println("lcm:"+lcm);	
s.close();				
		}
		
}


