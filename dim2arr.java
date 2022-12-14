package program;
import java.util.*;
public class dim2arr {
public static void main(String args[]) {
	dimension2array arr= new dimension2array();
	int [][] a=arr.readmat();
	arr.dipMat(a);
	//int b=arr.bigmatrixelements(a);
	//System.out.println(b);
	//int [][] b=arr.readmat();
	//arr.dipMat(b);
	//int[][] rs=arr.addmatrix(a, b);
//	arr.dipMat(rs);
//	int c=arr.primenumber(a);
	//System.out.println(c);
	int[][] t=arr.tran(a);
	arr.dipMat(t);
}
}
