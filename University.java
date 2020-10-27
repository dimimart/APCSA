public class University {
    public static void main (String[] args) {
        String [] Uni = new String [3];
        Uni [0] = "UC Santa Cruz";//try doing it [0] or something maybe its easier?
        Uni [1] = "U of San Fransisco";
        Uni [2] = "LMU";
        int shortName = 0;
        int nully = (int) 0;//later used for null stuff
        //that reminds me, make sure you do that (int) stuff
        int length = Uni[0].length();//keep track of ()
        for (int i = 0 ; i < Uni.length; i++) {
            System.out.println(Uni[i].length());
        }//end for loop
        for (int i = 0 ; i < Uni.length; i++) {
            if (Uni[i].length() < length) {
                length = Uni[i].length();
            }//end if statement
            if (length == Uni[i].length()) {
                shortName = i;
            }//end second? if statement
        }//end for 2
        System.out.println("\nThe school with the shortest name length is " + Uni[shortName] + "\n");//String School[index is replaced with shortname and shortname is the lowest letter count
        Uni[nully] = null;
        for (int i = 0; i < Uni.length; i++) {
            if (Uni[i] != null) { //! means not equal to
                System.out.println("The other school is " + Uni[i]);
            }//end if
        }//end for 3
    }//end static void
}//end main code
