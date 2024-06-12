package Arrays;

import java.util.Scanner;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,100,400,200,500,100};
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter The Value: ");
          int value=sc.nextInt();
          int count=0;
          
          
          for(int x:a ) 
          {
        	  if(x==value)
        	  {
        		  count++;
        	  }
        	  
          }
          System.out.println("Total duplicate count is :" +count);
		
	}

}
