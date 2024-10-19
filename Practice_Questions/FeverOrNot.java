
/*
 * Question2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
 * 
 */

 public class FeverOrNot {
    public static void main(String arg[]){
        double temp = 103.5;

        if (temp > 100){
            System.out.println("You have fever!! Get your medicine");
        }
        else{
            System.out.println("You don't have fever!! Chillout");
        }

    }
    
}