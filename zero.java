package program;
import java.util.*;
public class zero {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	int count=0;
	 do{
		if(a%10==0) {
			count++;
			
		}
		a=a/10;
	}while(a>0);System.out.println(count);
}
}
