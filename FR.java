public class FR {
public static void main(String [] args) {

	for(int index = 1; index <= 10; index ++) {

		System.out.println(index + "\t" + index*index + "\t" + (int)Math.floor(Math.random()*(index*index-index+1)+index));

	}//ends first for

	}//ends static void
}//ends public class
