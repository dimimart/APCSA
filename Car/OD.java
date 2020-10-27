//beg of car code
package Car;
public class OD {
  private int members;
  private int albums;
  private String name;
  private String RecordLabel;
  public Student() {
    members = 4;
    albums = 5;
    name = "One Direction";
    RecordLabel = "Sony";
  }//end constructor one
  public Student (String namE, String RecordLABEL) {
    name = namE;
    RecordLabel = RecordLABEL;
  }//end constructor two
  public Student (int memberS, int albumS) {
    members = memberS;
    albums = albumS;
  }//end constructor three
  public String toString() {
    return "Name of Band: " + name + "\n# of Members: " + members + "\n# of Albums: " + albums + "\nRecord Label: " + RecordLabel);
  }//end toString
}//end class
//end of car code
