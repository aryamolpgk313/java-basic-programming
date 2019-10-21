
public class Time {
import java.util.Scanner;
	public static void  main(String[]args)
			{
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
        float sp=S.nextFloat();
        float dist=S.nextFloat();
      float td=S.nextFloat();
      if((dist/sp)<=(.1666*td))
      {
        System.out.printf("Yes");
	}
      else{
         System.out.printf("No");
}
	}


