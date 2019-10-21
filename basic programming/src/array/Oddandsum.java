package array;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;

public class Oddandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int []a=new int[size];
	int sum=0;
	int i;

		for(i=0;i<size;i++) 
	{
			if(a[i]%2 ==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
			}
	 }
			for(i=0;i<size;i++)
				
			{
				if(a[i]%2!=0)	
			   {
					System.out.println(a[i]);
			sum=sum+a[i];
			    }
        	}
		
			s.close();				
}

}
