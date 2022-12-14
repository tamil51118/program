package program;
import java.util.*;
public class reader {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayOperation arr=new ArrayOperation();

	int y[]=arr.reader();
	
	arr.display(y);
	int x[]=arr.reader();
	arr.display(x);
	
	int c[]=arr.merge(x, y);
	
	arr.display(c);
	/*System.out.println("before revese");
	arr.display(y);
	arr.rev(y);
	System.out.println("after revese");
	arr.display(y);
	int big=arr.biggest(y);
	System.out.println("biggest number"+big);
	int sma=arr.smallest(y);
	System.out.println("smallest number"+sma);
	int sum=arr.sumofarray(y);
	System.out.println("sumofarray"+sum);
	int[] ct=arr.OddOrEven(y);
	System.out.println("evennum"+ct[0]);
	System.out.println("oddnum"+ct[1]);
	int count=arr.countprime(y);
	System.out.println("number of prime number"+count);
	
	arr.nonplaindr(y);*/
	
	
	
}
}
