package Decisionmaking;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s=new Scanner(System.in);	
		System.out.println("enter the limit:");	
		int size=s.nextInt();int i=0;
		String arr[]=new String[size];
		System.out.println("enter the words:");
		
		for(i=0;i<size;i++)
			arr[i]=s.next();
		char c;
		for(i=0;i<size;i++)
		{
		c=arr[i].charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println(arr[i]);	
		}
		s.close();
		}

}
