package program;
import java.util.*;
public class sum {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	/*int d=a/100;
	int d1=a%100;
	int d2=d1/10;
	int d3=d1%10;
	int sum=d+d2+d3;
	System.out.println("sum of digit"+sum);*/
	
	int sum=0;
	
	while(a>0) {
		 sum=sum+(a%10);
		a=a/10;
	}
	System.out.println(sum);
}
}
