package program;
import java.util.*;
public class sesp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int se=0;
int sp=0;
while(a>0)
	{
	int d=a%10;
	if(d==2 || d==4||d==6||d==8) {
		se=se+d;
	}
	else {
		sp=sp+d;
	}
	a=a/10;
	
}System.out.println("sum of even digit"+se);
System.out.println("sum of odd digit"+sp);
	}

}
