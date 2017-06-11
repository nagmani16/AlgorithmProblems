package recusion;

public class CalculateExponentValue {

	public static void main(String[] args) {

		System.out.println(calculateExponentValue(2,6));

	}

	private static int calculateExponentValue(int value, int exponent) {
		int y;
		if (exponent==0){
			
			return 1;
			
		} else 	if (exponent%2==0){
				
			 				
				 y= calculateExponentValue(value,exponent/2);
				 System.out.println(y*y);
				return y*y;
			}
				
			 else {
				
					y=  value*calculateExponentValue(value,exponent-1);
					 System.out.println(y);


			 return y;
			}
		}
		
	}	
		
		
	


