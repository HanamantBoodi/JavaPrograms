package JavaProgramQuestions;

public class swappinfTwoNumbers {

	public static void main(String[] args) {
		//swapping Two Numbers
		int a=10, b=20;
		
		System.out.println("Before swapping Number "+ a+" "+b);
		//Logic 1- Using third variable
		
		/*int t=a;
		a=b;
		b=t;
		System.out.println("After swapping Number "+ a+" "+b);
		*/
		//Logic 2--> By using + and - operator without using Third variable
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swapping Number "+ a+" "+b);
		

	}

}
