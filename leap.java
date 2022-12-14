package program;
import java.util.*;
public class leap {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%4==0&&n%400==0||n%100!=0) {
		System.out.println("it is a leap year");
	}
	else
	{
		System.out.println("it not a leap year");
	}
}
}
