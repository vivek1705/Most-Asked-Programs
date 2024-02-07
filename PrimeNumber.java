import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare variables to store the user input and count of factors
        int num, count = 0;

        System.out.println("Enter any number: ");
        num = sc.nextInt();

       // Loop to check the number of factors (divisors) of the given number
       for (int i = 1; i <= num; i++) 
       {
            if(num % i == 0){
                count++;
            }
        }

        // If the count is 2 (only two divisors: 1 and the number itself), it's a prime number
        if(count == 2)
        {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }

        sc.close();
    }
    
}
