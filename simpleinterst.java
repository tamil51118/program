package program;
import java.lang.*;
import java.util.Scanner;

public class simpleinterst {
public static void main (String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the principle");
	int p=sc.nextInt();
	System.out.println("enter rate of intrest");
	int r=sc.nextInt();
	System.out.println("enter time in year");
	int t=sc.nextInt();
	int si=(p*t*r)/100;
	System.out.println("simple interst"+si);
	System.out.println("total amout"+(si+p));
}
}
