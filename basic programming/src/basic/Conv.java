package basic;

import java.util.Scanner;

public class Conv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		char c=S.next().charAt(0);
		int n= S.nextInt();
		System.out.println((int)c);
		System.out.println((char)n);
		S.close();	
	}

}
