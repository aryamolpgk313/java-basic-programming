package Decisionmaking;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the Number:");
		int n=s.nextInt();
int sum=0;int f;
int i=1;
int num=n;
while (n!=0)
{
	f=1;
	int r=n%10;
	for(i=1;1<=r;i++)
	{
		f=f*i;
	}
	sum=sum+f;
	n/=10;
}
if(sum==num)
{
	System.out.println("strong no.");

}
else
{
	System.out.println("not strong.");
}
	s.close();
	}

}
