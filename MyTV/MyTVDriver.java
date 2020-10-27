package MyTV;
public class MyTVDriver {
	public static void main(String[] args) {
		//create a MyTV object called living room TV 
		MyTV livingRoomTV = new MyTV(33, "Samsung");
		MyTV bedroomTV = new MyTV(32, "Sony");
		System.out.println(bedroomTV);
		System.out.println(livingRoomTV);
		
		int screen = bedroomTV.getScreenSize();
		bedroomTV.setScreenSize(40);//order matters
		System.out.println(screen);
		}//end main method
}//end class