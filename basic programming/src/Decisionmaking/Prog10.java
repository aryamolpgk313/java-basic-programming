package Decisionmaking;

import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S=new Scanner(System.in);
int num=S.nextInt();
if(num>0) {
	System.out.println("positive");
	       if(num<8) {
	    		System.out.println(num=num+2);
  
	       }
	       else {
	    		System.out.println(num=num-2);

	       }
}
else {
	System.out.println("negative");

}S.close();
	}

}
