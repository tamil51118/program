package program;
import java.util.*;
public class odd {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2;i<=n;i++) {
		boolean rs=isprime(i);
		if(rs==true) {
			System.out.print(i+",");
		}
		
	}
}

 static boolean isprime(int x) {
	// TODO Auto-generated method stub
	 for(int j=2;j<=x/2;j++)
	 {
		 if(x%j==0) 
			 return false;
		 
	 }
	

 return true;
 }
}
