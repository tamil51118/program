package program;
import java.util.*;
public class patternstar {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int x=i;

		for(int j=1;j<=n;j++) {
			//System.out.print(x);
			
			if(j==1||j==n||i==j) {
				System.out.print(x+" ");
			}
					
			else {
				System.out.print(" "+" ");
			}
		x++;
		}
	System.out.println(" ");
}}
}
