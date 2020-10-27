public class GiantShuffle { public static void main(String[] args) {
	int maxRand = 9, minRand = 1, rand; 
	int[][] gShuffle= new int[30][40];
	int[] colCount = new int[maxRand - minRand + 1];
	for(int row = 0; row < gShuffle.length;  row++) {
		for(int col = 0; col < gShuffle[0].length; col++) {
			rand = (int)(Math.random()*colCount.length+minRand);
			if(row!= 0) colCount[rand-1]++;
			gShuffle[row][col] = rand;
		}//end for loop
	}//end for loop
	for(int col = 0; col < gShuffle[0].length; col++) {
		for(int row = 1; row < gShuffle.length; row++) {
			gShuffle[row][col] = gShuffle[0][col];
			if(colCount[gShuffle[0][col]-1] > 0) colCount[gShuffle[0][col]-1]--;
			else gShuffle[row][col] = 0; 
		}//end for loop
	}//end for loop
	for(int[] row : gShuffle) {
		for(int num : row)System.out.print(num);
		System.out.print("\n");
	}//end for loop
}//end static
}//end class
