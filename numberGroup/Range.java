public class Range implements NumberGroup {
   private int[] list;

   public Range(int min, int max) {
      list = new int[Math.abs(max-min+1)];
      for(int i = 0; i < list.length; i++) list[i] = min + i;
   }//end con

   public boolean contains(int num){
	  boolean check = false;
      for(int nummy: list) {
         if(num == nummy) {
            check = true;
         }//end if 
      }//end for 
      return check;
   }//end method
   
   public String toString() {
	   String output = "";
	   for(int i = 0; i < list.length; i++) {
		   output += list[i] + ", ";
	   }//end for 
	   return output;
   }//end toString
}//end class