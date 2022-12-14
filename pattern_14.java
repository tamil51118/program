package program;
import java.util.*;
public class pattern_14 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			//if(i==n/2+1||j==n/2+1) 
			//if(i+j==n+1||i==j)
			if(j==1||i==n||j==i)
			{
			System.out.print("X"+" ");
		}
			else {
				System.out.print(" "+" ");
			}
		
		}System.out.println();
	}
}
}
