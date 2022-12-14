package program;
import java.util.*;
public class good {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();

	int big=0;
	int small=9;
while(n!=0) {
	int d=n%10;
	if(big<d)
		big=d;
	else if(small>d)
		small=d;
	n=n/10;
	
}
//System.out.println(big);
//System.out.println(small);

int temp=big+small;
System.out.println(temp);

	}
}
