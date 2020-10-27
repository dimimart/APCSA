import java.util.Scanner;
import java.lang.Math;

public class Quadriaticlol {
  public static void main(String[] args) {
    Scanner keyb = new Scanner (System.in);

    int a, b, c;

    double first;
    double second;
    double answer;

    System.out.println("Enter a value for a");
    a = keyb.nextInt();
    System.out.println("Enter a value for b");
    b = keyb.nextInt();
    System.out.println("Enter a value for c");
    c = keyb.nextInt();

    int btwo = b*b;
    System.out.println("b^2 is " + btwo);
    int acfour = 4*a*c;
    System.out.println("4*a*c is " + acfour);

  if(btwo - acfour < 0) {
    System.out.println("Sorry, your discriminant is negative. We cannot process imaginary root right now...");
  }//ends first if
  else {
    answer = Math.sqrt(btwo - acfour);
    System.out.println("The sqrt of b^2 - 4ac is " + answer);
    first = (-b + answer)/(2*a);
    second = (-b - answer)/(2*a);
    System.out.println("Your first root is " + first);
    System.out.println("Your second root is " + second);
  }//ends first else
  }//end static
}//end class
