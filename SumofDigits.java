import java.util.Scanner;

public class SumofDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num, sum=0;

        System.out.println("Enter any number: ");
        num = sc.nextInt();

        // Loop to  iterate through each digit of the number until the number becomes 0.
        while (num != 0) {
            // Add the last digit of the number to the sum
            sum = sum + num % 10;
            // Remove the last digit from the number
            num = num / 10;
        }

        System.out.println("sum of digits are: " +sum);
        sc.close();
    }
}


/*Suppose the user enters the number 123.
In the first iteration, sum becomes 0 + 3 = 3, and num becomes 12.
In the second iteration, sum becomes 3 + 2 = 5, and num becomes 1.
In the third iteration, sum becomes 5 + 1 = 6, and num becomes 0.
The loop ends, and the final sum is 6, which is the sum of the digits 1 + 2 + 3 in the original number
 */