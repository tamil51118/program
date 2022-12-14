package program;
import java.util.*;
public class dimension2array {
	int[][] readmat(){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the order of matrix");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][] mat=new int[m][n];
	System.out.println("enter "+m*n+"elements rows wise");
    for (int i = 0; i < mat.length; i++) {
	for (int j = 0; j < mat[i].length; j++) {
		mat[i][j]=sc.nextInt();
		}
}return mat;
	
	}
	
void dipMat(int[][] mat) {
 for (int i =0; i < mat.length; i++) 
   {
		for (int j =0; j < mat[i].length; j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
}


int bigmatrixelements(int [][] mat){
	
	int big=mat[0][0];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			if(mat[i][j]>big)
				big=mat[i][j];
				
		}
		
	}
	
	return big;
}	

int sumofmatrix(int [][] s) {
	int sum=0;
	for (int i = 0; i < s.length; i++) {
		for (int j = 0; j < s[i].length; j++) {
			sum=sum+s[i][j];
		}
	}
	
	
	return sum;
	
}

int primenumber(int[][] p) {
	int a=0;
	for (int i = 0; i < p.length; i++) {
		for (int j = 0; j < p[i].length; j++) {
			boolean rs=prime(p[i][j]);
			if(rs==true) {
				a++;
			}
		}
	}
	
	return a;
	
}

 boolean prime(int i) {
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			return false;
		}
	}
	 return true;
}
int [][] addmatrix(int[][] x,int[][] y){
	if(x.length!=y.length||x[0].length!=y[0].length) {
		return null;
	}
	int[][] rs=new int[x.length][x[0].length] ;
	for (int i = 0; i < x.length; i++) {
		for (int j = 0; j < x[i].length; j++) {
			rs[i][j]=x[i][j]+y[i][j];
		}
		
	}
	return rs;
		}
int[][] tran(int[][] y){
	int[][] tr=new int[y[0].length][y.length];
	
	for (int i = 0; i < y.length; i++) {
		for (int j = 0; j < y[0].length; j++) {
			tr[j][i]=y[i][j];
		}
	}
	return tr;
	
	
	
	
}



}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
