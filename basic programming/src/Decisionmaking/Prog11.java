package Decisionmaking;

import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		String a=S.nextLine();
		int b=S.nextInt();
		int c=S.nextInt();
		if(a.equals("hp")) {
		if(b==20) {
			if(c==4) {
				System.out.println("successful");
			}
			else
			{
				System.out.println("HoD not");
				
			}}
			else {
				System.out.println("16 RAM not");

			}
			
		}
		else {
			System.out.println("not HP");
		}
		}
		
		

	}


