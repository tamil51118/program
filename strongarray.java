package program;
import java.util.*;
public class strongarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			int temp=a[i];
			int st=strongnum(a[i]);
			if(temp!=st) {
				count++;
			}
		}
		System.out.println("number of non strong number"+"----> "+count);
		
	}

static int strongnum(int i) {
int sum=0;
	while(i!=0) {
		int d=i%10;
		int fact=factorial(d);
		 sum=sum+fact;
		
		i=i/10;
	}
		
		return sum;
	}

static int factorial(int d) {
	int fact=1;
	for(int i=1;i<=d;i++) {
		fact=fact*i;
	}
	return fact;
}

}
