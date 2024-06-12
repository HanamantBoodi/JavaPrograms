package JavaProgramQuestions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a Value: ");
		int Num = sc.nextInt();
	
		int org_num=Num;
		// By using algorithm
		
		int rev=0;
		while(Num!=0)
		{
			rev= rev*10+Num%10;
			Num=Num/10;
		}
    if(org_num==rev)
    {
    	System.out.println("Number is palindrome:"+org_num);
	}else
	{
		System.out.println("Number is not palindrome:"+org_num);
	}
	}

}
