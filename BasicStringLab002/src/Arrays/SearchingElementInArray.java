package Arrays;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
	//	int search_element=30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value: ");
        int search_element=sc.nextInt();
        
        boolean status=false;
                 
                 for (int i=0;i<a.length;i++)
                 {
                	 if(a[i]==search_element)
                	 {
                		 System.out.println("Element Found");
                		 status=true;
                	     break;
                	 }
                	
                	 }
                 if(status==false) 
            	 {
            	 System.out.println("Element Not Found");
            	 }
                 }
	

}
