
/* check number is even or odd 
* even means completely divisible by zero (after divide by 2 reminder must zero)
* odd means not completely divisible by zero
*/

import java.util.Scanner;

public class Even_Odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;  
        System.out.println("enter any number: ");
        num = sc.nextInt();

        //if number is perfectly divisible by zero i.e remainder must zero.
        if(num % 2 == 0)
        {
            System.out.println(num+ " is even number");
        }
        else{
            System.out.println(num+ " is odd number");

        }
        sc.close();
    }
} 


/*
 * 10 % 2 = 5 remainder is 0 so even number
 * 11 % 2 = 5 with remainder 1 so (num % 2 == 0) condition is not meet, so odd number 
 */