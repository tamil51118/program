package program;
import java.util.*;

public class money {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount");
	int t=sc.nextInt();
	
	int a=t/2000;
	int a1=t%2000;
	int b=a1/1000;
	int b1=a1%1000;
	int c=b1/500;
	int c1=b1%500;
	int d=c1/100;
	int d1=c1%100;
	int e=d1/50;
	int e1=d1%50;
	int r=e1/10;
	int r1=e1%10;
	int y=r1/5;
	int y1=r1%5;
	
	
	System.out.println("entered the denomination"+t);
	System.out.println("2000 :"+a);
	System.out.println("1000 :"+b);
	System.out.println("500 :"+c);
	System.out.println("100 :"+d);
	System.out.println("50 :"+e);
	System.out.println("10 :"+r);
	System.out.println("5 :"+y);
	
}
}
