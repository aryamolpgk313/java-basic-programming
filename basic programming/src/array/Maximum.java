package array;
import java.util.Scanner;


public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int []a=new int[size];
		int m=0;
		int i;
		
		for( i=0;i<size;i++)
		{
			System.out.println("Enter the index["+i+"]");
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
		
			if(a[i]>=m)
				{
					m=a[i];
				}
		}
		System.out.println(m);
		s.close();	
}

}
