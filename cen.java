package program;
import java.util.*;
public class cen {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a<b && b<c )
		System.out.println(b+"center value");
	else if(a>b && a<c)
		System.out.println(a+"center value");
	else
		System.out.println(c+"center value");
		

	}
}
