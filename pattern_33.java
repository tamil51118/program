package program;
import java.util.*;
public class pattern_33 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of line");
		int n=sc.nextInt();
		
		int sp=0,st=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=1;j<=st;j++) {
				System.out.print(x+"");
				 
				x++;			}
				if(i<=n/2) {
					sp++;
					st=st-2;
				}
				else {
					sp--;
					st=st+2;
				}
				
				
			
		System.out.println();
	}
		}

}
