package program;
import java.util.*;
public class div {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int sum=0;
do{
	int d=a%10;
	sum=sum+d*d;
	a=a/10;
	
}while(a>0);
System.out.println(sum);
}
}