package Arrays;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		int a[]= {500,200,100,300,600,400};
		System.out.println("Before Sortin.....");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a));
	}

}
