package program;
import java.util.*;
public class npz {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>=1&& n<=12) {
	if(n==1||n==3||n==5||n==7||n==8||n==10||n==12) {
		System.out.println("31");
	}
	else if(n==4||n==6||n==9||n==11) {
		System.out.println("30");
	}
	else {
		System.out.println("28 or 29");
	}
}
else {
	System.out.println("plz enter the digit number");
}
	

}}
