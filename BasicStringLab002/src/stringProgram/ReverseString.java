package stringProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/*Approach 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater Sring Value: ");
		String s1=sc.next();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) 
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse String value: "+rev);*/
		
		//Approach 2- By converting string in to char array type
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enater Sring Value: ");
		String s1=sc.next();
		String rev="";
		char a[]=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String value: "+rev);*/
		
		//Approch-3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater Sring Value: ");
		String s1=sc.next();
		StringBuffer sb= new StringBuffer(s1);
		StringBuffer reverse=sb.reverse();
		System.out.println("Reverse String value: " +reverse);
	}

}
