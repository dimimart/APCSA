//beg of main code
package IntSearch;
import java.util.Arrays;
public class IntSearch {
	private int[] array;
	//public static int find(int[] array) {
		/*maybe try this later
		 public static int find(int[] a, int target) {
		 	for (int i = 0; i < array.length; i++} {
		 		if(array[i] == target) {
		 		return i;
		 		}//end if loop
		 	}//end for loop
		 } // public static 
		 */

		public static int find(int[] array) {
			int nums = 0;
		 	for (int i = 0; i < array.length; i++) {
		 		if(array[i] == 4) {
		 			nums = i;
		 		
		 		}//end if loop
		 	}//end for loop
		 	return nums;
		 } // public static 
		
		
		/*int look = 9;
		int not = -1;
		int nums = 0;
		for(int i = 0; i < array.length; i ++) {
			nums = Arrays.asList(array).indexOf(look);
		}//end for loop
		int ind = look - 1;
		if(nums == ind) {
			return nums;
		}//end if statement 
		else {
			return not;
		}//end else*/
	//end of static int 
}//end of class
//end of code