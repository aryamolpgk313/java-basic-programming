package basic;

import java.util.Scanner;

public class Floattt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		float n= S.nextFloat();
		System.out.printf("%.0f\n",n);
		System.out.printf("%.01f\n",n);
		System.out.printf("%.02f\n",n);
		System.out.printf("%.03f\n",n);
		S.close();
	}

}
