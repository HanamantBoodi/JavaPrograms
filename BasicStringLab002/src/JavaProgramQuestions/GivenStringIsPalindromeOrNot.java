package JavaProgramQuestions;

import java.util.Scanner;

public class GivenStringIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		
		String s1=sc.next();
		
		
		StringBuffer sb= new StringBuffer(s1);
		String rev=sb.reverse().toString();
		if(s1.equals(rev)) {
			System.out.println(rev+ "is palindrome");
		}else 
		{
			System.out.println(rev+ " is not palindrome");
		}
		 

	}

}
