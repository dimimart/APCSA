//start of driver
public class SmartPhoeDriver {
public static void main (String[] args) {
	SmartPhoe SmartPhone = new SmartPhoe("Samsung", 16);// "Hello", "Bang Bang", "Haha"
	System.out.println(SmartPhone + "\n");
	 int lol = SmartPhone.totalPlayTime();
	 System.out.println("Total Play Time: " + lol + " Seconds\n");
	SmartPhone.deleteAllSongs();
	System.out.println(SmartPhone);//going to be a blank space
}//end static method
}//end of driver class

