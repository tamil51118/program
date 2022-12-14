package program;
import java.util.*;
public class merge {
public static void main(String args[]) {
	ArrayOperation ar=new ArrayOperation();
	System.out.println("first array");
	int[] x=ar.reader();
	ar.display(x);
	System.out.println("second array");
	int[] y=ar.reader();
	ar.display(y);
	
	int[] mer=ar.merge(x,y);
	ar.display(mer);
	System.out.println("merged array");
}
}
