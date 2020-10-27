//start student driver code
package SU;
public class SUDriver{
  public static void main(String[] args){
	 // song songdos = new song("BTS", "Love Yourself", "Serendipity");
	 SU junior = new SU();
	 System.out.println(junior);
	 //public void setmathGPA(double[] grades) {
		//this.grades[1] = grades[1];
	//}//ending setter 
	 /*public void setMath(double[] grades) {
		this.grades[1] = 4.0;
	}//ending setter 
	*/

	 SU senior = new SU("Master", " Yoda", new double[]{2.5, 3.0, 3.5, 4.0, 3.5, 4.0} );
	 System.out.println(senior);
	 
	 /*int screen = bedroomTV.getScreenSize();
		bedroomTV.setScreenSize(40);//order matters
		System.out.println(screen);*/
	
	 double mate = senior.getMath();
	 SU seniordos = new SU("Second Master", " Yoda", new double[]{2.5, mate, 3.5, 4.0, 3.5, 4.0} );
	 System.out.println(seniordos);
	 System.out.println("New Math Grade: " + mate);
	 }//end static void
}//end class
//end student driver code
