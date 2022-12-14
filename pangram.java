package program;
import java.util.*;

public class pangram {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	String str2=sc.next();
	boolean rs=pandran(str1,str2);
	if(rs==true) {
		System.out.println("it contain all the elements");
	}
	else
	{
		System.out.println("it does not contains elements");
	}
}

 static boolean pandran(String str1, String str2) {
	 int[] ar=new int[26];
	 int[] ar1=new int[26];
	if(str1.length()==str2.length()) {
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			char ch1=str2.charAt(i);
			if(ch>='a' &&ch <='z' || ch1>='a'&&ch1<='z') {
				ar[ch-97]++;
				ar1[ch1-97]++;
			}
			else if(ch>='A' &&ch <='Z' || ch1>='A'&&ch1<='Z') {
				ar[ch-65]++;
				ar1[ch1-65]++;
			}
		}
		

		
	}
	else {
		return false;
	}
	return check(ar,ar1) ;
	
}

static boolean check(int[] ar, int[] ar1) {
	// TODO Auto-generated method stub
	for (int i = 0; i <26; i++) {
		if(ar[i]!=ar1[i])
			return false;
	}
	return true;
}
}
