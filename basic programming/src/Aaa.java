import java.util.Scanner;
public class Aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
	    int l1=S.nextInt();
	    int l2=S.nextInt();
	    int l3=S.nextInt();
	    String L=S.next();
	      if(L.equals("L1"))
	      {
	        if(l2<l3)
	        {
	          System.out.println("L2");
	        }
	       else{
	           System.out.println("L3");
	            }
	      }
	        else if(L.equals("L2"))
	        {
	          if(l1<l3)
	          {
	                    System.out.println("L1");
	          }
	          else{
	                    System.out.println("L3");
	               }
	        }
	      else if(L.equals("L3"))
	      {
	        if(l1<l2)
	        {
	        System.out.println("L1");
	      }
	        else{
	        System.out.println("L2");
	        }
	        }

	}

}
