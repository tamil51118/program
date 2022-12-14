package program;
import java.util.*;

public class sc {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("enter the special character");
	 int a=sc.nextInt();
	 
	 int d1=a/10;
	 int d2=a%10;
	 
	 int s=d1+d2+d1*d2;
     if(a==s)
    	 System.out.println(s+"is special character");
     else
    	 System.out.println(s+"is not special character");
	}

}
