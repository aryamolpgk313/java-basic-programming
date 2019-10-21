package Decisionmaking;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		String name=S.nextLine();
		int password=S.nextInt();
		if(name=="abc"&&password==123) {
			System.out.println("Success");
		}
		else {
			System.out.println(" Not Success");
		}
		S.close();
}

}
