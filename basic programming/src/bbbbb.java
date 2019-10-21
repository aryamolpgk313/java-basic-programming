
public class bbbbb {
import java.util.Scanner;
	public static void main(String[]args){
		// TODO Auto-generated method stub
		 Scanner S=new Scanner(System.in);
	      int l1=S.nextInt();
	       int l2=S.nextInt();
	       int l3=S.nextInt();
	      int n=S.nextInt();
	      int g;
	      String  gs;
	      int  s;
	      String ss;
	      int sg;
	      String sgs;
	    if(l1>l2&&l1>l3)
	    {
	      g=l1;
	      gs="l1";
	    }
	      else if(l2>l3)
	      {
	      g=l2;
	        gs="l2";
	      }
	      else
	      {
	        g=l3;
	        gs="l3";
	      }
	      if(l1<l2&&l1<l3)
	      {
	      s=l1;
	        ss="L1";
	      }
	      else if(l2<l3){
	      s=l2;
	        ss="L2";
	      }
	      else{
	      s=l3;
	        ss="L3";
	      }
	     if((l1>l2&&l1<l3)||(l1<l2&&l1>l3))
	     {
	     sg=l1;
	       sgs="L1";
	     }
	      else if((l2>l1&&l2<l3)||(l2<l1&&l2>l3))
	      {
	      sg=l2;
	        sgs="L2";
	       }
	     else{
	     sg=l3;
	       sgs="L3";
	     } 
	      if(n<=s)
	      {
	      System.out.println(ss);
	      }
	      else if(n>s&&n<sg){
	       System.out.println(sgs);
	      }
	      else{
	       System.out.println(gs);
	      }
	}


