package program;
import java.util.*;
public class pattern_namw {
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		String str=sc.next();
		 for(int i=0;i<str.length();i++) {
			 for(int j=0;j<=i;j++) {
				 
				char ch=str.charAt(j);
				System.out.print(ch);
				 
			 }
			 System.out.println(" ");
			 
		 }
	 }
}
