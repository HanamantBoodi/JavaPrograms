package Arrays;

public class SingleDimensional {

	public static void main(String[] args) {
		
//declaring Array
		//approach 1
		
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//approach 2
		int b[]= {100,200,300,400,500};
		
		//find length of an array
		System.out.println(a.length);
		
		//read single value from an array
		
		System.out.println(b[4]);
		
		//reading all the values from array
		
		/*for (int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		*/
		// enhanced for loop or for each loop
		
		for(int x:b) 
		{
			System.out.println(x);
		}
	
			
	}

}
