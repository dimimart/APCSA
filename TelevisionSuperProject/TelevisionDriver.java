import java.util.ArrayList;
public class TelevisionDriver {
public static void main (String[] args) {
//ArrayList<Type> str = new ArrayList<Type>();
ArrayList<TelevisionSuper> objects = new ArrayList<TelevisionSuper>();
HD hd = new HD(" HD           ", 59.99);
objects.add(hd);
DLP dlp = new DLP(" Silver      ", 99.99);
objects.add(dlp);
LCD lcd = new LCD(" Gold       ", 199.99);
objects.add(lcd);
LED led = new LED(" Platinum", 399.99);
objects.add(led);
Plasma plasma = new Plasma("Sapphire        ", 499.99);
objects.add(plasma);
//for each loop!
/*for(int i = 0; i < objects.size(); i++) {
	System.out.println(objects.get(i));
}//end for loop*/
System.out.println("TVs in the store...");
for(TelevisionSuper objecto : objects) {
	System.out.print(objecto + "\n");
}//end for each loop
}//end static 
}//end of driver class
