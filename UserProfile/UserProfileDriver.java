//start user driver code
package UserProfile;
public class UserProfileDriver {
  public static void main(String[] args){
  UserProfile me = new UserProfile();
  System.out.println(me);
  
  UserProfile mom = new UserProfile("Mom Gomez", "ponies", 788767, 41);
  System.out.println(mom);
}//end static void
}//end class
//end user driver code
