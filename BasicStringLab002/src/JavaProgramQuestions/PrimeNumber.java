package JavaProgramQuestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Natural Number >1
		// Which has only 2 factors 1 and itself
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater a Number: ");
		
		
		int num=sc.nextInt();
	
		int count=0;
		
		if(num>1) {
			for (int i=1;i<=num;i++) 
			{
				if(num%i==0) 
					count++;			
			}
		     if (count==2) {
		    	 System.out.println("Is a Prime Number");
		     }
		     else {
		    	 System.out.println("Is not a Prime Number");
		   
		     }
			
		}else
		{
			System.out.println("Not a Prime Number");
		}

	}

}
