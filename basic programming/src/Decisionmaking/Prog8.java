package Decisionmaking;

import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		String n=S.nextLine();
		if(n=="A") {
			if(n=="Av")	{
				System.out.println("A+");
			}
			else {
				System.out.println("A-");

			}}
	else if(n=="D")  {
				if(n=="Bv") {
					System.out.println("B+");

				}
				else {
					System.out.println("B-");

			}
		}S.close();
	}

}
