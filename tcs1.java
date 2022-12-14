package program;
import java.util.*;
public class tcs1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int rev=0;
	if(n<0)
	{
		n=n*-1;
	}
	while(n!=0) {
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	if(temp<0) {
	System.out.println(rev=rev*-1);
	
	}
	else {
		System.out.println(rev);
	}
	
		}
}

