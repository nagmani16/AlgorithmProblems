package dynamicProgramin;


/*
 * Problem- You are given coins of different dominations and total Amount of Money. Write a function to compute the number of combinations that make up the amount
 * 
  */

/*
 * Solution-
 * Logic here to solve this problem with dynamic programming.
 * Formula is to create the combination array with total+1 size and set the first value as 1
 * so whenever combination[currentCombination]>currentAmount
 * then find combination for each coin with the formula which combination[currnetAmount]+combination[currentAmount-currentCoin]
 * Assign this to currentCombination 
 * 
 */

public class CoinCombination {

	public static void main(String[] args) {

		System.out.println(MaxChangeCombination(12, new int[] {1,2,5}));
	}

	private static int MaxChangeCombination(int total, int[] coins) {
	
		
		int[] combinations= new int [total+1];
		
		combinations[0]=1;
		
		for (int coin:coins){
			
			for(int currentAmount=1;currentAmount<combinations.length;currentAmount++){
				
				if (currentAmount>=coin){
					
					combinations[currentAmount]= combinations[currentAmount]+ combinations[currentAmount-coin];
				}
				
			}
			
			
			
			
		}
		
		return combinations[total];
	}

}
