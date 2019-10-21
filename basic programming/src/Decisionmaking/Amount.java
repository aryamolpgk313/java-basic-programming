package Decisionmaking;

import java.util.Scanner;

public class Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
int amount=S.nextInt();
if(amount==0)
{
	System.out.println("No balance");
}
else{
	System.out.println("Has balance");
}S.close();

}

}
