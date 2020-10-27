public class BeginArrays {
	public static void main(String[] args) {
		int[] nums = new int[12];
		nums[0] = 5;
		nums[1] = 23;
		for(int index = 0; index <= nums.length; index++) { //traversing an array
			nums[index] = index;
		}//ends for			how long array is
		for(int index = 0; index <= nums.length; index++) {
			System.out.println(nums[index]);
		}//ends for
	}//end static
}//end class