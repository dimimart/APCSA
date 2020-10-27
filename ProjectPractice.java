public class ProjectPractice {
private int[] simmy = {1, 2, 3, 4, 5, 6, 7, 9, 0},perfect, prime, six, none, one, two, three, four, five, siX, seven, eight, nine, zero, finalLista;//initializes multiple arrays into one line (prob not gonna use them all lol)
		 
	

		public int[] getLista() {
			for(int l = 0, first = Integer.parseInt(Integer.toString(simmy[l]).substring(0, 1)); l < simmy.length; l++) {
				if(first == 3) three[l] = simmy[l];		//3890145726
				if(first == 1) one[l] = simmy[l]; 		//do this to all if statements later
				if(first == 2) two[l] = simmy[l]; 
				if(first == 4) four[l] = simmy[l]; 
				if(first == 5) five[l] = simmy[l]; 
				if(first == 6) siX[l] = simmy[l]; 		//FIX LATER!Q!!
				if(first == 7) seven[l] = simmy[l]; 
				if(first == 8) eight[l] = simmy[l]; 
				if(first == 9) nine[l] = simmy[l]; 
				if(first == 0) zero[l] = simmy[l]; 
				}//end for loop 
			//int[] total  = combine(three, eight), total1 = combine(total,nine), total2 = combine(total1,zero), total3 = combine(total2, one), total4 = combine(total3, four), total5 = combine(total4, five), total6 = combine(total5, seven), total7 = combine(total6, two), total8 = combine(total7, siX);
			//finalLista = total8;
			for(int i = 0; i < three.length; i++) finalLista[i] = three[i];
			for(int i = 0; i < eight.length; i++) finalLista[three.length + i] = eight[i];
			for(int i = 0; i < nine.length; i++) finalLista[three.length + eight.length + i] = nine[i];
			for(int i = 0; i < zero.length; i++) finalLista[three.length + eight.length + i + nine.length] = zero[i];
			for(int i = 0; i < one.length; i++) finalLista[three.length + eight.length + i + nine.length + zero.length] = one[i];
			for(int i = 0; i < four.length; i++) finalLista[three.length + eight.length + i + nine.length + zero.length + one.length] = four[i];
			for(int i = 0; i < five.length; i++) finalLista[three.length + eight.length + i + nine.length + zero.length + one.length + four.length] = five[i];
			for(int i = 0; i < seven.length; i++) finalLista[three.length + eight.length + i + nine.length + zero.length + one.length + four.length + five.length] = seven[i];
			for(int i = 0; i < two.length; i++) finalLista[three.length + eight.length + i + nine.length + zero.length + one.length + four.length + five.length + seven.length] = two[i];
			for(int i = 0; i < siX.length; i++) finalLista[three.length + eight.length + i + nine.length + zero.length + one.length + four.length + five.length + seven.length + two.length] = siX[i];
			return finalLista;	
		}//end setter 
	 
		
		 
		/* public static int[] combine(int[] array0, int[] array1) {
			 int totalLength = array0.length + array1.length;
			 int[] ans = new int[totalLength];
			 for(int j = 0; j < array0.length; j++) ans[j] = array0[j];
			 for(int i = 0; i < array1.length; i++)ans[i+array0.length] = array1[i];
			return ans;
		 }//end method 
		
/*Parameters : 
	source_arr : array to be copied from
	sourcePos : starting position in source array from where to copy
	dest_arr : array to be copied in
	destPos : starting position in destination array, where to copy in
	len : total no. of components to be copied.
			
			System.arraycopy(three, 0, finalLista, 0, three.length);
			System.arraycopy(eight, 0, finalLista, three.length, eight.length);
			System.arraycopy(nine, 0, finalLista, eight.length, nine.length);
			System.arraycopy(zero, 0, finalLista, nine.length, zero.length);		//use a for loop???
			System.arraycopy(one, 0, finalLista, zero.length, one.length);
			System.arraycopy(four, 0, finalLista, one.length, four.length);
			System.arraycopy(five, 0, finalLista, four.length, five.length);
			System.arraycopy(seven, 0, finalLista, five.length, seven.length);
			System.arraycopy(two, 0, finalLista, seven.length, two.length);
			System.arraycopy(six, 0, finalLista, two.length, six.length); */
	
		public int[] getPerfect() { 
			for(int i = 0; i < finalLista.length; i++) 
				if(((int) Math.sqrt(finalLista[i]))*((int) Math.sqrt(finalLista[i])) == finalLista[i] || finalLista[i] == 0) 
					perfect[i] = finalLista[i]; //end of perfect squares ALSO dont mix up perfect and prime arrays !!	 
			return perfect; 
		}//end perfect getter
		
		public int[] getPrime() {
			for(int i = 0; i < finalLista.length; i++) {
			for(int e = 0; i < perfect.length; i++) if(finalLista[i] == perfect[e]) continue; //checks if its in perfect array
				for(int h = 2; h < finalLista[i] / 2; h++) {
					if((finalLista[i] / h == 0)) { // && finalLista[i] != perfect[i]
						prime[i] = finalLista[i];
					}//end if statement
				}//end second for loop 
			}//end first for loop
			return prime;
		}//end prime getter 
		
		public int[] getSix() {		//initializing diff int into one line
			for(int i = 0, sum = 0, num = finalLista[i], lastDigit = num % 10; i < finalLista.length; i++) {
				//if(finalLista[i] == perfect[i] || finalLista[i] == prime[i]) continue; 
				for(int e = 0; e < perfect.length; e++) if(finalLista[i] == perfect[e]) continue;
				for(int f = 0; f < prime.length; f++) if(finalLista[i] == prime[f]) continue;
				if(((String.valueOf(finalLista[i]).length() != 1) || finalLista[i] == 6)) {
					while (num > 0) {
				        sum += lastDigit;
				        num /= 10;
				    }//end while loop
			        if((sum % 6 == 0)) { // || finalLista[i] == 6
						six[i] = finalLista[i];
					}//end second if 
				}//end first if 
			}//end first for loop 
			return six;
		}//end six getter
		
		public int[] getNone() {
			for(int i = 0; i < finalLista.length; i++) {
				for(int e = 0; i < perfect.length; e++) if(finalLista[i] == perfect[e]) continue;
				for(int f = 0; f < prime.length; f++) if(finalLista[i] == prime[f]) continue;
				for(int g = 0; g < prime.length; g++) if(finalLista[i] == six[g]) continue;
				else none[i] = finalLista[i];
				//end if statement 
			}//end for loop
			return none;
		}//end none getter 
		
		public String toString() {String output = "Perfect Square Numbers: " + getPerfect() + "\nPrime Numbers: " + getPrime() + "\nNumbers that don't fall into a category: " + getNone() + "\nNumbers whose digits added are multiples of six: " + getSix(); 
			return output;
		}//end toString()
		
//end static 			
}//end main class