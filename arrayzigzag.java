package program;
import java.lang.*;
import java.util.*;
public class arrayzigzag {
	public static void main(String args[]) {
ArrayOperation arr=new ArrayOperation();
System.out.println("first arrays");
int[] x=arr.reader();
 arr.display(x);
System.out.println("second arrays");
int y[]=arr.reader();
arr.display(y);

int z[]=arr.zigzag(x,y);
	}

	
}
