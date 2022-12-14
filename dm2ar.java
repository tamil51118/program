package program;

import java.util.Scanner;

public class dm2ar {
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] str=new int[r][c];
	for(int i=0;i<str.length;i++) {
		for(int j=0;j<str[i].length;i++) {
			str[i][j]=sc.nextInt();
		}
	}
	
}
}
