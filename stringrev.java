package program;
import java.util.*;
public class stringrev {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	int f=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') 
		{
			f=i;
		}
		if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
			char temp=ch[i];
			ch[i]=ch[f];
			ch[f]=temp;
		}

			
			
	}
	
	str=new String(ch);
	
	System.out.println(str);
	
}}	


