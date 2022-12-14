package program;
import java.util.*;
public class vote {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the age");
	int age=s.nextInt();
	if(age>18)
		System.out.println("valid for vote");
	else
		System.out.println("not vaild for vote");
	
}
}
