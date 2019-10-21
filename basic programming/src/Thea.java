import java.util.Scanner;
public class Thea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		
	      int a=S.nextInt();
	      float t=S.nextFloat();
	    if(a>=13&t==13.30)
	    {
	       System.out.println("$5.00");
	    }
	    else if(a<13&t==13.30) 
	     {
	        System.out.println("$2.00");
	    }
	  else if(a>13)
	       {
	         System.out.println("$8.00");
	       }
	  else
	      {
	         System.out.println("$4.00");
		   }
	}

}
