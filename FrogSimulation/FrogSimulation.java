//beg of main code
package FrogSimulation;
public class FrogSimulation {

	private int goalDistance;
	private int maxHops;
	boolean simulate;
	int hopDistance = 0;
	int num = 13;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}//end of constructor
	
	//this is private, so you cant use it in the driver
	private int hopDistance() {
		for (int i = 0; i < maxHops; i++) {
			hopDistance += num + num;
			
			if(hopDistance > goalDistance || hopDistance < 0) {
				break;
			}//end if 
		}//end of for loop
		
		
		
	/*	int[] array = new int[numHops];
		//this here below will "add" integers to my array
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)Math.random()*(dist + 1);
		}//end of for loop
		
			//finding sum of all the integers within the array
			for(int i : array) { //reference notes for this  
				if(hopDistance < goalDistance) {
					//try doing this, for reference try going back to the textbooks i have @ home for help
					hopDistance+=i;
					//simulate = false;
				}//end if statement 
					if(hopDistance >= goalDistance || hopDistance < 0) {
						break;//supposed to end the for without ending the entire code 
					}//end if statement
				
			}//end of for loop
			*/	
		
		//int hopDistance = goalDistance;
		return hopDistance;
	}//end of hop?
	
	public boolean simulate() {
		if(hopDistance >= goalDistance) {
			simulate = true;
		}//end else 
		else {
			simulate = false;
		}//end else
		return simulate;
	}//end of simulate
	
	/*public String toString() {
		String output = h;
		return output;
	}//end of tostring*/
}//end of main code
