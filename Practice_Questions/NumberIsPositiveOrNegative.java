
// Check if the number is positive or negative

import java.util.*;

public class NumberIsPositiveOrNegative {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int a = sc.nextInt();                                         // Taking iunput from user

        if (a < 0){                                                   // If a number is less than 0 then negative 
            System.out.println("This number is negative!");
        }
        else{                                                         // else it is positive
            System.out.println("This number is positive!");
        }

        sc.close();
    }
    
    
}
