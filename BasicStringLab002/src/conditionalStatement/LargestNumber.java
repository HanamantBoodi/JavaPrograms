package conditionalStatement;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10,b=20,c=30;
      
      if(a>b && a>c)
      {
    	  System.out.println("a is the largest Value");
      }
      else if(b>a && b>c)
      {
    	  System.out.println("b is the largest Value");
      }
      else if (c>a && c>b)
      {
    	  System.out.println("c is the largest Value");
      }
	}

}
