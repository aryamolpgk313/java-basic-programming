package Decisionmaking;

import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S=new Scanner(System.in);
int mark=S.nextInt();
if(mark>=90) {
	System.out.println('A');
}

else if(mark>80){
	System.out.println('B');
}
else {
	System.out.println('C');

}S.close();
	}

}
