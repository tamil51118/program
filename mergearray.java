package program;
import java.util.*;
public class mergearray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of an array");
	int n=sc.nextInt();
	int[] x=new int[n];
	for(int i=0;i<x.length;i++) {
		x[i]=sc.nextInt();
	}
	System.out.println("enter the length of an array");
	int a=sc.nextInt();
	int[] y=new int[a];
	for(int i=0;i<y.length;i++) {
		y[i]=sc.nextInt();
	}
	
	
	int c[]=merge(x,y);
	System.out.println("merged array");
	
for(int i=0;i<c.length;i++) {
	System.out.print(c[i]+" ");
}
}

static int[] merge(int[] x, int[] y) {
	int[] c=new int[x.length+y.length];
	for(int i=0;i<x.length;i++) {
		c[i]=x[i];
	}
	for(int i=0;i<y.length;i++) {
		c[x.length+i]=y[i];
	}
	return c;
	
}
}
