package program;
import java.util.*;
public class tcs {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String str1=str.toLowerCase();
	char ch=sc.next().charAt(0);
	
	
		if(str1.charAt(0)==str1.charAt(str.length()-1)) {
			//System.out.println("1");
		  
			int[] n=countstring(str1,ch);
			
	
			for(int j=0;j<n.length;j++)
			{
				
				if(n[j]!=0) {
					System.out.println(n[j]);
					
				}
			}
			
			
		}
		else
		{
			System.out.println(0);
		}
		
		
	}

static int[] countstring(String str,char ch) {
	// TODO Auto-generated method stub
	int[] st=new int[26];
	for(int i=0;i<str.length();i++) {
		char f=str.charAt(i);
		if(ch==f) {
		if(f>='a'&&f<='z') {
			st[f-97]++;
		}
		
	}
	}
	return st;
}
}
