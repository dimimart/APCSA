public class ProgramThree {
	public static void main(String args[]) {
		int[] array = new int[10];
		int counter = 0;//have to start at 0
		int counterEvenRemoved = 0;
		int counterPositiveInt = 0;
		for(int i = 0; i < 10; i++) {
			array[i] = (int)((Math.random() * 200) - 100);
			System.out.println("a- " + array[i]);//what a is in assignment
		}//ends for loop
		System.out.println("\n");//skip line
		for(int i = 0; i < 10; i++) {
			if(array[i] % 2 == 0) {
				array[i] = ((int)(Math.random() * 100)) * 2 - 101;
				counterEvenRemoved++;
			}//ends if
			System.out.println("b- " + array[i]);//what b is in assignment
		}//ends for
		System.out.println("\n");//skip line
		while(counter != 10) {
			if(array[counter] > 0) {
				counterPositiveInt++;
			}//ends if -> while
			System.out.println("c- " + array[counter]);//what c is in assignment
			counter++;
		}//ends while
		System.out.println("\n");//line skipped 
		System.out.println("d- " + counterPositiveInt);//number of positive numbers removed
		System.out.println("d- " + counterEvenRemoved);//number of even numbers removed
	}//ends main
}//ends class
//end of code 3
