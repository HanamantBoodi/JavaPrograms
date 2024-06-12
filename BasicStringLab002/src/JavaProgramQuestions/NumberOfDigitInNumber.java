package JavaProgramQuestions;

import java.util.Scanner;

public class NumberOfDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      
      int Num=sc.nextInt();
      
      StringBuffer sb = new StringBuffer(String.valueOf(Num));
      int len=sb.length();
      System.out.println("Number of digit is:"+ len);
	}

}
