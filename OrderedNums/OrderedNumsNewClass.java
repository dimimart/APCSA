package OrderedNums;
import java.util.ArrayList;
public class OrderedNumsNewClass { OrderedNums listy = new OrderedNums();
int[] u = listy.getList();
ArrayList<Integer> zero = new ArrayList<Integer>(), three = new ArrayList<Integer>(),  nine = new ArrayList<Integer>(), eight = new ArrayList<Integer>(), seven = new ArrayList<Integer>(), siX = new ArrayList<Integer>(), five = new ArrayList<Integer>(), four = new ArrayList<Integer>(), two = new ArrayList<Integer>(), one = new ArrayList<Integer>(), six = new ArrayList<Integer>(), none = new ArrayList<Integer>(), prime = new ArrayList<Integer>(), perfect = new ArrayList<Integer>(), bad = new ArrayList<Integer>(), simmy = new ArrayList<Integer>();
private static ArrayList<Integer> newList = new ArrayList<Integer>();
public OrderedNumsNewClass() { this.newList = newList;
}//end constructor
public void setSimmy() {	 for(int i = 0; i <u.length; i++) bad.add(u[i]); 
for(int y = 0; y < bad.size(); y++) {int first = (bad.get(y))*100;
			while(first >= 10) { first = first/ 10;//getting first digit 
				if(first == 3) three.add(bad.get(y));		//3890145726
				if(first == 1) one.add(bad.get(y)); 	
				if(first == 2) two.add(bad.get(y)); 
				if(first == 4) four.add(bad.get(y)); 
				if(first == 5) five.add(bad.get(y)); 
				if(first == 6) siX.add(bad.get(y)); 	
				if(first == 7) seven.add(bad.get(y)); 
				if(first == 8) eight.add(bad.get(y)); 
				if(first == 9) nine.add(bad.get(y)); 
			}//end while loop
	}//end for loop
			simmy.addAll(three);
			simmy.addAll(eight);
			simmy.addAll(nine);
			simmy.add(0);
			simmy.addAll(one);			//ensures i get like the "order" i need for my list
			simmy.addAll(four);
			simmy.addAll(five);
			simmy.addAll(seven);
			simmy.addAll(two);
			simmy.addAll(siX);  
		}//end setter  ?
		public ArrayList<Integer> getPerfect() {	for(int i = 0; i < simmy.size(); i++) if(((int) Math.sqrt(simmy.get(i)))*((int) Math.sqrt(simmy.get(i))) == simmy.get(i) || simmy.get(i) == 0) perfect.add(simmy.get(i)); 
			return perfect; 
		}//end perfect getsimmy
		public ArrayList<Integer> getPrime() {  boolean primeOR;
			for(int i = 0; i < simmy.size(); i++) { primeOR = true;
				 if(Math.sqrt(simmy.get(i)) == (int)(Math.sqrt(simmy.get(i)))) continue; 
					for(int h = 2; h < simmy.get(i) / 2; h++)  if((simmy.get(i) % h == 0)) primeOR = false;
				if(primeOR) prime.add(simmy.get(i));
			}//end first for loop
			return prime;
		}//end prime getsimmy
		public ArrayList<Integer> getSix() { for(int i = 0 ; i < simmy.size(); i++) { for(int e = 0; e < perfect.size(); e++) if(simmy.get(i) == perfect.get(e)) continue;//skips perfect and prime numbers 
				for(int f = 0; f < prime.size(); f++) if(simmy.get(i) == prime.get(f)) continue;
				int remmy = 0, summy = 0, nummy = simmy.get(i);
				while(nummy > 0){ remmy = nummy % 10;
					summy = summy + remmy;    //this will add the digits together 
					nummy = nummy / 10;
				}//end while
				if(summy % 6 == 0 && simmy.get(i) != 0) six.add(simmy.get(i));
			}//end for loop
			return six;
		}//end getter six 
		public void printAll() { ArrayList<Integer> One= getPerfect(), Two = getPrime(), Three = getSix(),  Four = getNone();
			newList.addAll(One);
			newList.addAll(Two);
			newList.addAll(Three);
			newList.addAll(Four);
		}//end 
		public ArrayList<Integer> getNone() { for(int i = 0; i<simmy.size(); i++) if(!(perfect.contains(simmy.get(i))|| prime.contains(simmy.get(i)) || six.contains(simmy.get(i)))) none.add(simmy.get(i));
			return none;	
		}//end getter
		public static ArrayList<Integer> getList() { return newList;
		}//end static
		public String toString() { printAll(); String output = "NewList: " + newList; 
			return output;
		}//end toString()
}//end class
