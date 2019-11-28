package simpleifelse;
import java.util.Scanner;
public class strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=s.nextInt();
		int f,i=0,r,sum=0;
		int num=n;
		while(n>0)
		{  
			f=1;
			r=n%10;
			for(i=1;i<=r;i++)
			{
			f=f*i;
			}
			sum=sum+f;
			n=n/10;
			
		}
		if(sum==num)
		{
		System.out.println("It is a strong number");
		}
		else
		{
			System.out.println("Not strong number");
		}
		s.close();
	}

}
