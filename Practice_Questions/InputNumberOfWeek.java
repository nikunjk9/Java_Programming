/*
 * 
 * Question3 : Write a Java program to input week number (1-7) and print day of week name using switch case.
 * 
 */

import java.util.*;

public class InputNumberOfWeek {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 : System.out.println("Monday");
                        break;
            case 2 : System.out.println("Tuesday");
                        break;
            case 3 : System.out.println("Wednesday");
                        break;
            case 4 : System.out.println("Thusday");
                        break;
            case 5 : System.out.println("Friday");
                        break;
            case 6 : System.out.println("Saturday");
                        break;
            case 7 : System.out.println("Sunday");
                        break;
            default : System.out.println("There are only 7 days in a week! You stupid");

        }

        sc.close();
   
    }
    
}
