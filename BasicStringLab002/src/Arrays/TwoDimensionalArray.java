package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//declaring Array
				//approach 1
				
				int a[][]=new int[3][2];
				
				a[0][0]=100;
				a[0][1]=200;
				
				a[1][0]=300;
				a[1][1]=400;
				
				a[2][0]=500;
				a[2][1]=600;
				
				//approach 2
				
				int b[][]= {{100,200},{300,400},{500,600}};
				
				//find length of an array
				
				System.out.println("Number of Rows:"+a.length);
				System.out.println("Number of columns:"+a[0].length);
				
				//read single value from an array
				System.out.println(a[2][1]);
				
				
				//reading all the values from array
				
				for (int r=0;r<a.length;r++)
				{
					for(int c=0;c<a[r].length;c++) 
					{
						System.out.print(a[r][c]+"  ");
					}
					System.out.println();
				}
				// enhanced for loop 
				
				for(int arr[]:a)
				{
					for(int x:arr)
					{
						System.out.print(x+"  ");
					}
					System.out.println();
				}
				

	}

}
