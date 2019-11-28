package Switchstatement;
import java.util.Scanner;

public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the college:");
		String college=s.nextLine();
		System.out.print("Enter the department:B-tech/M-tech");
		String dept=s.nextLine();
		switch (college)
		{
			case "MES":
				switch (dept)
				{
					case "B-tech":
						System.out.printf("Seats Available");
						break;
					case "M-tech":
						System.out.printf("50 seats Available");
						break;
				    default:
				    	System.out.printf("No seats Available");
				    	break;
						
				}
				break;
			case "AJCE":
				switch (dept)
				{
				case "B-tech":
					System.out.printf("20 seats Available");
					break;
				case "M-tech":
					System.out.printf("Seats Available");
					break;
					default:
						System.out.printf("Not recognized");
					
				}
				break;
				default:
					System.out.printf("College is not registered");
				
		}

	}

}
