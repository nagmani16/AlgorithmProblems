package recusion;

public class QuckSort {

	public static void main(String[] args) {
          
		int a[] = {7,0,5,4,3,2,1,4};
		
		quickSortArray(a,0,a.length-1);
		
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

	private static void quickSortArray(int[] a, int startIndex, int endIndex) {
		
		/*
		 * this method will calculate the partitioned index and divide the main array
		 * to the sub arrays and then recursively call quick sort to sort them
		 * in the beginning partition index will be  the first number in the array
		 * Pivot will always be the last number of the array
		 * idea is to keep number which is less than pivot is to keep in left and larger than pivot is to keep in right
		 * To do that we need compare each number with pivot starting from portioned index
		 *
		 * if it is less than move forward
		 * if not more than pivot then swap that number from portioned index
		 * change partition index to the next number 
		 * complete this till start index is less than end index
		 *  
		 */
		
		
		if (startIndex<endIndex){
			
			// calculate the partitioned index
			
			int partitionIndex= partion(a, startIndex,endIndex);
			
			quickSortArray(a,startIndex,partitionIndex-1);
			quickSortArray(a,partitionIndex+1,endIndex);
			
		}
		
		
		
		
	}

	private static int partion(int[] a, int startIndex, int endIndex) {
		
		int partitionIndex= startIndex;
		int pivot= a[endIndex];
		
		
		for (int i=startIndex; i<endIndex;i++){
			if (a[i]<=pivot){
				int temp =a[i];
				a[i]= a[partitionIndex];
				a[partitionIndex]=temp;
				
				partitionIndex++;
				
			} 
				
			
		}
		
		
		
		int temp = a[partitionIndex];
		a[partitionIndex]=a[endIndex];
		a[endIndex]=temp;
		
		return partitionIndex;
	}





}
	
	


