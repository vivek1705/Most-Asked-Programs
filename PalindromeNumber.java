import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num; int reverse=0;
        System.out.println("Enter any Number: ");
        num = sc.nextInt();

        int original = num;
        // Loop to  iterate through each digit of the number until the number becomes 0.
        while (num != 0)
        {
            //multiply the reversed number by ten and add last digit to original number.
            reverse = reverse * 10 + num % 10;
            //remove last digit
            num = num / 10;
        }

        if (reverse == original)
        {
            System.out.println("Number is Palindrome.");    
        }
        else{
            System.out.println("Number is not Palindrome.");
        }
        sc.close();
    }
}
