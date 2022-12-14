package program;

import java.util.Scanner;

public class divisor {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		for( int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
				
			}
			
		}
	}
}
