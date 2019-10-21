import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
	    int x=S.nextInt();
	     double mark=0;
	      for(int i=1;i<=3;i++)
	      {
	      if(x%2!=0)
	      {
	      mark=mark+1;
	      }
	     else if(x<0)
	      {
	        mark=mark-1;
	       break;
	      }
	    else 
	    {
	        mark=mark-0.5;
	    }
	      }
	      System.out.printf("%.1f",mark);  
		// TODO Auto-generated method stub

	}

}
