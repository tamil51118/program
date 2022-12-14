package program;
import java.util.*;
public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int temp=0;
while(a>0) {
	int d=a%10;
	temp=d;
	System.out.print(temp);
	a=a/10;
}
	}

}
