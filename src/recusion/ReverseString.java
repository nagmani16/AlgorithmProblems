package recusion;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("the reverse for hello is"  + " " + reverse("nagmani")  );

		

	}

	/*
	 * this will be solved through a recursive call 
	 * so base case will be if length of the string is zero then return it self
	 * so call this base case every time by reducing the length every time by one character 
	 * while doing it also add the first character of the new substring 
	 * 
	 */
	
	private static String reverse(String s) {

		if (s.length()==0){
			return s;
		 } else {
			 return (reverse(s.substring(1)) + s.charAt(0));
		 }
			 
		
		
		
	}

}
