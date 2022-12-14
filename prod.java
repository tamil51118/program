package program;
import java.util.*;
public class prod {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	int product=1;
	do {
		int d=a%10;
		product=product*d;
		a=a/10;
		
	}while(a!=0);
	System.out.println(product);
}
}
