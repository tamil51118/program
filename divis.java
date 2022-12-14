package program;

import java.util.Scanner;

public class divis {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		for( int i=1;i<=a;i++) {
			if(i%3==0) {
				
				System.out.println(i);	
			}
			
		}
	}
}
