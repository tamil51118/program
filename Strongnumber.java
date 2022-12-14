package program;
import java.util.*;
public class Strongnumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int sn=strongnumber(n);

if(temp==sn)
	System.out.println("it is a strong number");
else
	System.out.println("it is not a strong number");
 
}

static int strongnumber(int n) {
	// TODO Auto-generated method stub
	
	int sum=0;

	while(n!=0) 
	{
		int d=n%10;
		 sum=sum+factorial(d);
		n=n/10;}
	return sum;
	}


 static int factorial(int x)
 {
	
	 int fact=1;
	 do
	 {
		 fact=fact*x;
		 x--;
	 }while(x!=0);
	return fact;
 }
 
 
}