package program;
import java.util.*;
public class two {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
if(a>=10&& a<=99 || a>=-10&& a<=-99) {
	System.out.println(a+"is two digit number");
}
else
{
	System.out.println(a+"is not two digit number");
}
}
}
