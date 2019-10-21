package sting;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner S=new Scanner(System.in);
      String a=S.nextLine();
	 int n=a.length();
	 int count=0;
		  for(int i=0;i<n;i++)
		    {
			char chr=a.charAt(i);
			if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U')
			     {
			    count=count+1;
			    for(int j=0;j<count;j++)
			     {
			     System.out.print("*");
			     }
			    System.out.print(chr); 
			    for(int k=0;k<count;k++)
			     {
				
				System.out.print("*");
			     }
			    
		     }
	           else{
				  System.out.print(chr); 
			  }
			    	
			    }
}	
}

			

		