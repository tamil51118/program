package program;
import java.util.*;
public class distinct {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a==b || c==b|| b==c) {
		System.out.println("plz enter distinct value");
	}
	else {
		if(a<b&&b<c || c<b&&b<a ) {
			System.out.println(b);
		}
		else if(b<a&&a<c || c<a&&a<b ) {
			System.out.println(a);
		}
		else {
			System.out.println(c);
		}
	}
}
}
