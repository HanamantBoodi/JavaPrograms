package JavaProgramQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entaer a Number:");
		int Num=sc.nextInt();
		
		int org_num=Num;
		// By using algorithm
		
		/*int rev=0;
		while(Num!=0)
		{
			rev= rev*10+Num%10;
			Num=Num/10;
		}
		System.out.println("Reverse Number is: "+ rev);
*/
		
		
		// By using StringBuffer
		/*
		StringBuffer sb= new StringBuffer(String.valueOf(Num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse Numer is: "+ rev); */
		
		
		// By using StringBuilder
		
		StringBuilder slb= new StringBuilder();
		slb.append(Num);
		StringBuilder rev=slb.reverse();
		System.out.println("Reverse Number is: "+ rev);
	}

}
