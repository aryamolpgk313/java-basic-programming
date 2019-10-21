package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r;
int sum=0;
System.out.print("enter the number:");
int a=Integer.parseInt(br.readLine());
int b=a;
while (a!=0)
	{
	 r=a%10;
	sum=(sum*10)+r;
	a=a/2;
	
	}
if(sum==b) {
	System.out.println("yes");
}
else
	{
	System.out.println("no");
	
	}

}}
