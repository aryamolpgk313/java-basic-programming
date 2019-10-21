package Decisionmaking;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int num=S.nextInt();
		if(num>0) {
			System.out.println("positive");	
	}
		else if(num<0){
			System.out.println("negative");

		}
		else {
			System.out.println("zero");

		}S.close();
		}
}
