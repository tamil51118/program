package program;
import java.util.*;
public class ArrayOperation {

	
int[] reader()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length of array");
		int n=sc.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
}

void display(int[] x) {
	for(int i=0;i<x.length;i++) {
		System.out.print(x[i]+" ");
	}System.out.println("");
}


void  rev(int[] x) {
	int i=0,j=x.length-1;
	while(i<j)
	{
		int temp=x[i];
		x[i]=x[j];
		x[j]=temp;
		i++;
		j--;
	}
	
	
	
}


int biggest(int [] x) {
	int big=x[0];
	for(int i=0;i<x.length;i++) {
		if(x[i]>big) {
			big=x[i];
		}
	}return big;
	
}

public int smallest(int[] x) {
	
	int smal=x[0];
	for(int i=0;i<x.length;i++) {
		if(x[i]<smal) {
			smal=x[i];
		}
	}
	return smal;
}

public int sumofarray(int[] x) {
	int sum=0;
	for(int i=0;i<x.length;i++) {
		sum=sum+x[i];
	}
return sum;
}

 public int[] OddOrEven(int[] x) {
	int oc=0,ed=0;
	for(int i=0;i<x.length;i++) {
		if(x[i]%2==0) {
			oc++;
		}
		else {
			ed++;
		}
	
}
	int[] count = {oc,ed};
	return count;
	}

int [] merge(int[] x, int[] y) {
    int c[]= new int[x.length+y.length];
    for(int i=0;i<x.length;i++) {
    	c[i]=x[i];
    }
    for(int i=0;i<y.length;i++) {
    	c[x.length+i]=y[i];
    }
	return c;
	
}

int countprime(int[] x) {
	int count=0;
	for(int i=0;i<x.length;i++) {
	boolean bs=isPrime(x[i]);
	if(bs==true)
		count++;
	}
return count;
}

 boolean isPrime(int x) {
	for(int i=2;i<=x/2;i++) {
		if(x%i==0) {
			return false;
		}
	}
	return true;
}

int nonplain(int x) {
	int sum=0;
	do {
			int d=x%10;
			 sum=sum*10+d;
			 x=x/10;
		}while(x>0);
	
	return sum;
}


void nonplaindr(int[] x)
{
	for(int i=0;i<x.length;i++) {
		int temp=x[i];
		int rs=nonplain(x[i]);
		if(temp!=rs) {
		 System.out.println("non plaindrome"+x[i]);
		}
		
		
	}
	

}

 int[] zigzag(int[] x, int[] y) {
	// TODO Auto-generated method stub
	 int[] z=new int[x.length+y.length];
	 int i=0,j=0,k=0;
	 while(i<x.length&&j<y.length) {
		 
		
		 z[k]=x[i];
		 i++;
		 z[k]=y[i];
		 j++;
	 }
	 while(i<x.length) {
		 x[k]=z[i];
		 i++;
	 }
	 while(j<x.length) {
		 y[k]=z[j];
		 j++;
	 }
	 
	return null;
}


}