package array;

import java.util.Arrays;
import java.util.Scanner;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int []a=new int[size];
		
		int i;
		
		for( i=0;i<size;i++)
		{
			System.out.println("Enter the index["+i+"]");
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[size-2]);
		s.close();	
		}

}
