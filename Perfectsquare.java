package Perfectsquare;
import java.util.Scanner;
public class Perfectsquare {

	public static String Perfectnum(int n) {
		String s = null;
	
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) {
				s="true";
			}
			else {
				s="false";
			}
	
	}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String value=Perfectnum(n);
		System.out.println(value);

	}

}
