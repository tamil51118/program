package program;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class pattern {
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print((char)(x+64)+" ");
				
				x++;
			}

				System.out.println();						}
				
				
}}
