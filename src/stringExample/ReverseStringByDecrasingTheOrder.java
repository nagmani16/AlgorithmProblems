package stringExample;

public class ReverseStringByDecrasingTheOrder {

	public static void main(String[] args) {
		reverse("hello");
	}
	
	/*
	 * get the String into array
	 * start printing the array from back
	 */

	private static void reverse(String s) {
		 
		char[]length= s.toCharArray();
			
		System.out.print("the reverse is " + " " );

		for (int i= length.length-1;i>=0;i--){
			System.out.print(length[i]);
		}
		

	}

}
