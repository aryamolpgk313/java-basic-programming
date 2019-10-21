package array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int size=s.nextInt();
int[] values=new int[size];
int sum=0;
int i=0;
values[i]=s.nextInt();

for( i=0;i<size;i++)
{
	System.out.println("Enter the index["+i+"]");
	values[i]=s.nextInt();
}
		sum=sum+values[i];
	
			System.out.println(sum);
			s.close();
		}
}

	



