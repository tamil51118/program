package program;
import java.util.*;
public class fibno {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int s=0,y=0;
do {
	int d=a%10;
	if(d%2==0) {
		s++;
	}
	else {
		y++;
	}
	a=a/10;
}while(a!=0);

if(y==3&&s==3) {
	System.out.println("good");
}
else {
	System.out.println("bad");
}
}

}
